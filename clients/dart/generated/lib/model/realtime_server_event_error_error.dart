//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeServerEventErrorError {
  /// Returns a new [RealtimeServerEventErrorError] instance.
  RealtimeServerEventErrorError({
    required this.type,
    this.code,
    required this.message,
    this.param,
    this.eventId,
  });

  /// The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
  String type;

  /// Error code, if any.
  String? code;

  /// A human-readable error message.
  String message;

  /// Parameter related to the error, if any.
  String? param;

  /// The event_id of the client event that caused the error, if applicable. 
  String? eventId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeServerEventErrorError &&
    other.type == type &&
    other.code == code &&
    other.message == message &&
    other.param == param &&
    other.eventId == eventId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (code == null ? 0 : code!.hashCode) +
    (message.hashCode) +
    (param == null ? 0 : param!.hashCode) +
    (eventId == null ? 0 : eventId!.hashCode);

  @override
  String toString() => 'RealtimeServerEventErrorError[type=$type, code=$code, message=$message, param=$param, eventId=$eventId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
      json[r'message'] = this.message;
    if (this.param != null) {
      json[r'param'] = this.param;
    } else {
      json[r'param'] = null;
    }
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeServerEventErrorError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeServerEventErrorError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeServerEventErrorError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeServerEventErrorError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeServerEventErrorError(
        type: mapValueOfType<String>(json, r'type')!,
        code: mapValueOfType<String>(json, r'code'),
        message: mapValueOfType<String>(json, r'message')!,
        param: mapValueOfType<String>(json, r'param'),
        eventId: mapValueOfType<String>(json, r'event_id'),
      );
    }
    return null;
  }

  static List<RealtimeServerEventErrorError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeServerEventErrorError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeServerEventErrorError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeServerEventErrorError> mapFromJson(dynamic json) {
    final map = <String, RealtimeServerEventErrorError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeServerEventErrorError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeServerEventErrorError-objects as value to a dart map
  static Map<String, List<RealtimeServerEventErrorError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeServerEventErrorError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeServerEventErrorError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'message',
  };
}

