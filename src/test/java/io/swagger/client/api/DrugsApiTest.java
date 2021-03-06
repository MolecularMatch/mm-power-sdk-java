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
import io.swagger.client.model.Drug;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SearchResponseDrug;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for DrugsApi
 */
@Ignore
public class DrugsApiTest {

    private final DrugsApi api = new DrugsApi();

    /**
     * Get a Drug
     *
     * Get a drug
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDrugTest() throws ApiException {
        String id = null;
        Drug response = api.getDrug(id);

        // TODO: test validations
    }
    /**
     * Search for drugs
     *
     * Search for drugs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchDrugsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponseDrug response = api.searchDrugs(body);

        // TODO: test validations
    }
}
