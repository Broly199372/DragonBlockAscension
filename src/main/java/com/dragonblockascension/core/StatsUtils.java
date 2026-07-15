package com.dragonblockascension.core;

public class StatsUtils {
    public float maxHealth;
    public float currentHealth;
    public float healthRegenRate;
    public float drainHealthRate;
    public float healthPercentage;
    public float maxStamina;
    public float currentStamina;
    public float staminaRegenRate;
    public float drainStaminaRate;
    public float staminaPercentage;


    public void setMaxHealth(float maxHealth) {
        this.maxHealth = Math.max(maxHealth, 0.0f);
        clampCurrentHealth();
    }

    public void sethealthPercentage(float healthPercentage) {
        this.healthPercentage = Math.max(Math.min(healthPercentage, 100.0f), 0.0f);
        clampCurrentHealthPercentage();
    }
    public void clampCurrentHealthPercentage() {
        if (healthPercentage >= 100.0f) {
            healthPercentage = 100.0f;
        }
        if (healthPercentage <= 0.0f) {
            healthPercentage = 0.0f;
        }
    }

    public void setCurrentHealth(float currentHealth) {
        this.currentHealth = currentHealth;
        clampCurrentHealth();
    }

    public void setHealthRegenRate(float healthRegenRate) {
        if (currentHealth <= maxHealth) {
            currentHealth += healthRegenRate;
        }
        this.healthRegenRate = Math.max(healthRegenRate, 0.0f);
        clampCurrentHealth();
    }

    
}