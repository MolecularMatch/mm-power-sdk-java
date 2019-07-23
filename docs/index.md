# Welcome to the MMPower Java SDK

## Requirements

Building the API client library requires:

1. Java 1.7+
1. Maven/Gradle

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

Please follow the [installation](#installation) instructions and execute the following Java code:

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

