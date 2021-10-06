package pl.targosz.homework.CodeRefactoringLesson5Task5;

public class Car extends Vehicle{
    private boolean engineStarted;

    protected void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

    protected void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    @Override
    public boolean goingForward() {
        return false;
    }

    @Override
    public boolean goingBackwards() {
        return true;
    }
}
