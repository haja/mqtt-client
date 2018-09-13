package org.fusesource.mqtt.android.client;

import java.io.IOException;

import org.fusesource.mqtt.android.codec.CONNACK;

public class MQTTException extends IOException {
  public final CONNACK connack;

  public MQTTException(String msg, CONNACK connack) {
    super(msg);
    this.connack = connack;
  }
}
