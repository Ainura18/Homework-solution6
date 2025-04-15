package chainofresponsibility;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equalsIgnoreCase("account_ban") || issue.equalsIgnoreCase("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}

