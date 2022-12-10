package ru.bekker.decorator.developer;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    private String sendWeekReport() {
        return "Send Week Report. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
