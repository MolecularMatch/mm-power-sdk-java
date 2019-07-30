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
import io.swagger.client.model.Publication;
import io.swagger.client.model.SearchRequest;
import io.swagger.client.model.SearchResponsePublication;
import org.junit.Test;
import org.junit.Ignore;


/**
 * API tests for PublicationApi
 */
@Ignore
public class PublicationApiTest {

    private final PublicationApi api = new PublicationApi();

    /**
     * Get the count of Publications matching a searchRequest
     *
     * Get the count of Publications matching a searchRequest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countPublicationsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponsePublication response = api.countPublications(body);

        // TODO: test validations
    }
    /**
     * Get a Publication
     *
     * Get a Publication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPublicationTest() throws ApiException {
        String id = null;
        Publication response = api.getPublication(id);

        // TODO: test validations
    }
    /**
     * Search for Publications
     *
     * Search for Publications
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchPublicationsTest() throws ApiException {
        SearchRequest body = null;
        SearchResponsePublication response = api.searchPublications(body);

        // TODO: test validations
    }
}
