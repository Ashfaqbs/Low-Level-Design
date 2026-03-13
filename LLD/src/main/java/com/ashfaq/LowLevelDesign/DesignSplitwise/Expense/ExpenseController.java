package com.ashfaq.LowLevelDesign.DesignSplitwise.Expense;

import com.ashfaq.LowLevelDesign.DesignSplitwise.BalanceSheetController;
import com.ashfaq.LowLevelDesign.DesignSplitwise.Expense.Split.ExpenseSplit;
import com.ashfaq.LowLevelDesign.DesignSplitwise.Expense.Split.Split;
import com.ashfaq.LowLevelDesign.DesignSplitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}
