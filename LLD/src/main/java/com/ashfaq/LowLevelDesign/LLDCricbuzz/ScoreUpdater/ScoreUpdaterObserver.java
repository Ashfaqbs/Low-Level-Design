package com.ashfaq.LowLevelDesign.LLDCricbuzz.ScoreUpdater;


import com.ashfaq.LowLevelDesign.LLDCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}
