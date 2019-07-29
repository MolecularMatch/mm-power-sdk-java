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
import io.swagger.client.model.ClinicalTrial;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SearchResponseClinicalTrial;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for ClinicalTrialsApi
 */
@Ignore
public class ClinicalTrialsApiTest {

    private final ClinicalTrialsApi api = new ClinicalTrialsApi();

    /**
     * Get the count of Clinical Trials matching a searchRequest
     *
     * Get the count of Clinical Trials matching a searchRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countTrialsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponseClinicalTrial response = api.countTrials(body);

        // TODO: test validations
    }
    /**
     * Get a Clinical Trial
     *
     * Get a Clinical Trial
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrialTest() throws ApiException {
        String :Id = null;
        ClinicalTrial response = api.getTrial(:Id);

        // TODO: test validations
    }
    /**
     * Search for clinical trials
     *
     * Search for clinical trials
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTrialsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponseClinicalTrial response = api.searchTrials(body);

        // TODO: test validations
    }
}
