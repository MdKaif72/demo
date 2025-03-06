package com.task04;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.syndicate.deployment.annotations.lambda.LambdaHandler;

@LambdaHandler(lambdaName = "", roleName = "")
public class SQSHandler implements RequestHandler<SQSEvent, Void> {
	@Override
	public Void handleRequest(SQSEvent event, Context context) {
		event.getRecords().forEach(record -> {
			context.getLogger().log("Message: " + record.getBody());
		});
		return null;
	}
}
