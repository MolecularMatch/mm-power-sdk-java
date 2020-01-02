/*
 * MolecularMatch MMPower
 * MMPower API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@molecularmatch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Institution;
import io.swagger.client.model.PrivateTrial;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for InstitutionsApi
 */
@Ignore
public class InstitutionsApiTest {

    private final InstitutionsApi api = new InstitutionsApi();

    /**
     * Delete an institution
     *
     * Delete an institution
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstitutionTest() throws ApiException {
        String id = null;
        Institution response = api.deleteInstitution(id);

        // TODO: test validations
    }
    /**
     * Delete a private trial
     *
     * Delete a private trial
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePrivateTrialTest() throws ApiException {
        String id = null;
        String trialId = null;
        PrivateTrial response = api.deletePrivateTrial(id, trialId);

        // TODO: test validations
    }
    /**
     * Get an institution
     *
     * Get an institution
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionTest() throws ApiException {
        String id = null;
        Institution response = api.getInstitution(id);

        // TODO: test validations
    }
    /**
     * Get an institution record&#x27;s status
     *
     * Get an institution status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionStatusTest() throws ApiException {
        String id = null;
        Institution response = api.getInstitutionStatus(id);

        // TODO: test validations
    }
    /**
     * Get a paginated list of institutions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionsTest() throws ApiException {
        Institution response = api.getInstitutions();

        // TODO: test validations
    }
    /**
     * Get a private trial
     *
     * Get a private trial
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateTrialTest() throws ApiException {
        String id = null;
        String trialId = null;
        PrivateTrial response = api.getPrivateTrial(id, trialId);

        // TODO: test validations
    }
    /**
     * Get a private trial record&#x27;s status
     *
     * Get a private trial&#x27;s status
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrivateTrialStatusTest() throws ApiException {
        String id = null;
        String trialId = null;
        PrivateTrial response = api.getPrivateTrialStatus(id, trialId);

        // TODO: test validations
    }
    /**
     * Create an institution
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postInstitutionTest() throws ApiException {
        Institution body = null;
        Institution response = api.postInstitution(body);

        // TODO: test validations
    }
    /**
     * Create a private trial
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPrivateTrialTest() throws ApiException {
        PrivateTrial body = null;
        PrivateTrial response = api.postPrivateTrial(body);

        // TODO: test validations
    }
    /**
     * Put/Update an institution
     *
     * Put an institution
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putInstitutionTest() throws ApiException {
        String id = null;
        Institution response = api.putInstitution(id);

        // TODO: test validations
    }
    /**
     * Put/Update a private trial
     *
     * Put a private trial
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPrivateTrialTest() throws ApiException {
        String id = null;
        String trialId = null;
        PrivateTrial response = api.putPrivateTrial(id, trialId);

        // TODO: test validations
    }
}