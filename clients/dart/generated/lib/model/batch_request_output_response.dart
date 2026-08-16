//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BatchRequestOutputResponse {
  /// Returns a new [BatchRequestOutputResponse] instance.
  BatchRequestOutputResponse({
    this.statusCode,
    this.requestId,
    this.body,
  });

  /// The HTTP status code of the response
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? statusCode;

  /// An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? requestId;

  /// The JSON body of the response
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? body;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BatchRequestOutputResponse &&
    other.statusCode == statusCode &&
    other.requestId == requestId &&
    other.body == body;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (statusCode == null ? 0 : statusCode!.hashCode) +
    (requestId == null ? 0 : requestId!.hashCode) +
    (body == null ? 0 : body!.hashCode);

  @override
  String toString() => 'BatchRequestOutputResponse[statusCode=$statusCode, requestId=$requestId, body=$body]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.statusCode != null) {
      json[r'status_code'] = this.statusCode;
    } else {
      json[r'status_code'] = null;
    }
    if (this.requestId != null) {
      json[r'request_id'] = this.requestId;
    } else {
      json[r'request_id'] = null;
    }
    if (this.body != null) {
      json[r'body'] = this.body;
    } else {
      json[r'body'] = null;
    }
    return json;
  }

  /// Returns a new [BatchRequestOutputResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BatchRequestOutputResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BatchRequestOutputResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BatchRequestOutputResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BatchRequestOutputResponse(
        statusCode: mapValueOfType<int>(json, r'status_code'),
        requestId: mapValueOfType<String>(json, r'request_id'),
        body: mapValueOfType<Object>(json, r'body'),
      );
    }
    return null;
  }

  static List<BatchRequestOutputResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchRequestOutputResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchRequestOutputResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BatchRequestOutputResponse> mapFromJson(dynamic json) {
    final map = <String, BatchRequestOutputResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BatchRequestOutputResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BatchRequestOutputResponse-objects as value to a dart map
  static Map<String, List<BatchRequestOutputResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BatchRequestOutputResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BatchRequestOutputResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

