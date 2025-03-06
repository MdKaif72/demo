package com.task04;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.syndicate.deployment.annotations.lambda.LambdaHandler;

@LambdaHandler(lambdaName = "", roleName = "")
public class SNSHandler implements RequestHandler<SNSEvent, Void> {
    @Override
    public Void handleRequest(SNSEvent event, Context context) {
        event.getRecords().forEach(record -> {
            context.getLogger().log("Message: " + record.getSNS().getMessage());
        });
        return null;
    }
}
