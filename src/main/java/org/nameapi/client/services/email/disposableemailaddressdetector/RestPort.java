package org.nameapi.client.services.email.disposableemailaddressdetector;

import com.optimaize.anythingworks.client.rest.http.HeaderParams;
import com.optimaize.anythingworks.client.rest.http.QueryParams;
import com.optimaize.anythingworks.client.rest.http.RestHttpClient;
import com.optimaize.anythingworks.client.rest.http.RestHttpClientResponse;
import com.optimaize.anythingworks.common.rest.TypeRef;
import org.nameapi.client.services.RestServicePort;
import org.nameapi.ontology5.services.email.disposableemailaddressdetector.DisposableEmailAddressDetectorResult;

/**
 *
 */
class RestPort extends RestServicePort {

    private static final TypeRef returnType = new TypeRef<DisposableEmailAddressDetectorResult>() {};

    public RestPort(RestHttpClient restApiClient, String servicePath) {
        super(restApiClient, servicePath);
    }

    public DisposableEmailAddressDetectorResult call(String apiKey, String emailAddress) {
        QueryParams queryParams = QueryParams.create();
        queryParams.add("apiKey", apiKey);
        queryParams.add("emailAddress", emailAddress);

        RestHttpClientResponse<DisposableEmailAddressDetectorResult> response = restApiClient.invokeGet(
                servicePath,
                queryParams, HeaderParams.none(),
                returnType
        );
        return response.getResult().get();
    }

}
