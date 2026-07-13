package com.dragonblockascension.core;

public abstract class KiUtils {
    private float maxKi;
    private float currentKi;
    private float kiRegenRate;
    private float drainKiRate;
    private float kiPercentage;

    public void setMaxKi(float maxKi) {
        this.maxKi = Math.max(maxKi, 0.0f);
        clampCurrentKi();
    }

    public void setkiPercentage(float kiPercentage) {
        this.kiPercentage = Math.max(Math.min(kiPercentage, 100.0f), 0.0f);
        clampCurrentKiPercentage();
    }
    public void clampCurrentKiPercentage() {
        if (kiPercentage >= 100.0f) {
            kiPercentage = 100.0f;
        }
        if (kiPercentage <= 0.0f) {
            kiPercentage = 0.0f;
        }
    }

    public void setCurrentKi(float currentKi) {
        this.currentKi = currentKi;
        clampCurrentKi();
    }

    public void setKiRegenRate(float kiRegenRate) {
        this.kiRegenRate = Math.max(kiRegenRate, 0.0f);
    }

    public void setDrainKiRate(float drainKiRate) {
        this.drainKiRate = Math.max(drainKiRate, 0.0f);
    }

    public void regenerateKi() {
        if (maxKi <= 0.0f) {
            return;
        }

        currentKi = Math.min(currentKi + kiRegenRate, maxKi);
        clampCurrentKi();
    }

    public void drainKi() {
        if (maxKi <= 0.0f) {
            return;
        }

        currentKi = Math.max(currentKi - drainKiRate, 0.0f);
        clampCurrentKi();
    }

    public float getMaxKi() {
        return maxKi;
    }

    public float getCurrentKi() {
        return currentKi;
    }

    public float getKiRegenRate() {
        return kiRegenRate;
    }

    public float getDrainKiRate() {
        return drainKiRate;
    }

    public float getKiPercentage() {
        return kiPercentage;
    }

    private void clampCurrentKi() {
        if (currentKi > maxKi) {
            currentKi = maxKi;
        }
        if (currentKi < 0.0f) {
            currentKi = 0.0f;
        }
    }

    private void updateKiPercentage() {
        if (maxKi <= 0.0f) {
            kiPercentage = 0.0f;
            return;
        }
    }
}