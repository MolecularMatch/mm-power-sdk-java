# mm-power-sdk-java
https://molecularmatch.github.io/mm-power-sdk-java/

MolecularMatch MMPower
- API version: 1.0.0

MMPower API


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.molecularmatch</groupId>
  <artifactId>mm-power-sdk-java</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.molecularmatch:mm-power-sdk-java:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mm-power-sdk-java-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AssertionsApi;

import java.io.File;
import java.util.*;

public class AssertionsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();


        AssertionsApi apiInstance = new AssertionsApi();
        SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
        try {
            SearchResponseDrug result = apiInstance.searchAssertions(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssertionsApi#searchAssertions");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.molecularmatch.com/v4*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssertionsApi* | [**searchAssertions**](docs/AssertionsApi.md#searchAssertions) | **POST** /assertion/search | Search for assertions

## Documentation for Models

 - [ArmGroup](docs/ArmGroup.md)
 - [Assertion](docs/Assertion.md)
 - [AssertionClassifications](docs/AssertionClassifications.md)
 - [AssertionPrevalence](docs/AssertionPrevalence.md)
 - [AssertionSources](docs/AssertionSources.md)
 - [AssertionTags](docs/AssertionTags.md)
 - [AssertionTherapeuticContext](docs/AssertionTherapeuticContext.md)
 - [AssertionTier](docs/AssertionTier.md)
 - [AssertionTierExplanation](docs/AssertionTierExplanation.md)
 - [AssertionTiers](docs/AssertionTiers.md)
 - [ClinicalTrial](docs/ClinicalTrial.md)
 - [ClinicalTrialArmGroups](docs/ClinicalTrialArmGroups.md)
 - [ClinicalTrialCountries](docs/ClinicalTrialCountries.md)
 - [ClinicalTrialEligibility](docs/ClinicalTrialEligibility.md)
 - [ClinicalTrialGeo](docs/ClinicalTrialGeo.md)
 - [ClinicalTrialInterventions](docs/ClinicalTrialInterventions.md)
 - [ClinicalTrialLeadSponsor](docs/ClinicalTrialLeadSponsor.md)
 - [ClinicalTrialLocationSummary](docs/ClinicalTrialLocationSummary.md)
 - [ClinicalTrialLocationSummaryCountries](docs/ClinicalTrialLocationSummaryCountries.md)
 - [ClinicalTrialLocations](docs/ClinicalTrialLocations.md)
 - [ClinicalTrialMolecularAlterations](docs/ClinicalTrialMolecularAlterations.md)
 - [ClinicalTrialOverallContact](docs/ClinicalTrialOverallContact.md)
 - [ClinicalTrialOverallContactBackup](docs/ClinicalTrialOverallContactBackup.md)
 - [ClinicalTrialOverallOfficial](docs/ClinicalTrialOverallOfficial.md)
 - [ClinicalTrialPrimaryOutcomes](docs/ClinicalTrialPrimaryOutcomes.md)
 - [ClinicalTrialSponsors](docs/ClinicalTrialSponsors.md)
 - [ClinicalTrialStudyDesign](docs/ClinicalTrialStudyDesign.md)
 - [ClinicalTrialSynonyms](docs/ClinicalTrialSynonyms.md)
 - [ClinicalTrialTags](docs/ClinicalTrialTags.md)
 - [Contact](docs/Contact.md)
 - [Drug](docs/Drug.md)
 - [DrugAvailability](docs/DrugAvailability.md)
 - [DrugBrands](docs/DrugBrands.md)
 - [DrugCompositeTags](docs/DrugCompositeTags.md)
 - [DrugDosages](docs/DrugDosages.md)
 - [DrugDrugclass](docs/DrugDrugclass.md)
 - [DrugExternalIds](docs/DrugExternalIds.md)
 - [DrugParents](docs/DrugParents.md)
 - [DrugPharmacology](docs/DrugPharmacology.md)
 - [DrugPrices](docs/DrugPrices.md)
 - [DrugSynonyms](docs/DrugSynonyms.md)
 - [Eligibility](docs/Eligibility.md)
 - [Filter](docs/Filter.md)
 - [Intervention](docs/Intervention.md)
 - [MolecularAlteration](docs/MolecularAlteration.md)
 - [Outcome](docs/Outcome.md)
 - [Publication](docs/Publication.md)
 - [PublicationAuthors](docs/PublicationAuthors.md)
 - [SearchRequest](docs/SearchRequest.md)
 - [SearchRequestGeopoint](docs/SearchRequestGeopoint.md)
 - [SearchRequestLocation](docs/SearchRequestLocation.md)
 - [SearchRequestMinShouldMatch](docs/SearchRequestMinShouldMatch.md)
 - [SearchResponseClinicalTrial](docs/SearchResponseClinicalTrial.md)
 - [SearchResponseDrug](docs/SearchResponseDrug.md)
 - [SearchResponseDrugRows](docs/SearchResponseDrugRows.md)
 - [SearchResponsePublication](docs/SearchResponsePublication.md)
 - [Sponsor](docs/Sponsor.md)
 - [StandardizedTier](docs/StandardizedTier.md)
 - [StudyDesign](docs/StudyDesign.md)
 - [Tag](docs/Tag.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### bearerAuth



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@molecularmatch.com
