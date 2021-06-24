package com.bni46;

import java.util.Arrays;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.quarkus.redis.client.RedisClient;

@Path("/mobtun")
public class GreetingResource {
	@Inject
	RedisClient redisClient;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Response request(MobtunRequest request) {
		String responseDummy = "98765432";
		MobtunResponse resp = new MobtunResponse(responseDummy);
		
		redisClient.set(Arrays.asList(request.phoneNum, responseDummy));		
		
        return Response.ok
				(resp)
				.build();
    }
}