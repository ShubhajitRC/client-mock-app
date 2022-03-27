package com.roy.explore.client.mock.app.delegate;

import com.roy.explore.openapi.model.MockData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class MockApiDelegateImpl implements com.roy.explore.openapi.api.MockApiDelegate {

  public ResponseEntity<MockData> getMockClient() {
    MockData data = new MockData();
    data.setId("Test_1");
    data.setName("Test_Application");
    return new ResponseEntity<>(data,HttpStatus.OK);

  }
}
