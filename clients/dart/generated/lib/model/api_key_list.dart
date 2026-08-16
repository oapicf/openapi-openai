//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiKeyList {
  /// Returns a new [ApiKeyList] instance.
  ApiKeyList({
    this.object,
    this.data = const [],
    this.hasMore,
    this.firstId,
    this.lastId,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? object;

  List<AdminApiKey> data;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasMore;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? firstId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? lastId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ApiKeyList &&
    other.object == object &&
    _deepEquality.equals(other.data, data) &&
    other.hasMore == hasMore &&
    other.firstId == firstId &&
    other.lastId == lastId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object == null ? 0 : object!.hashCode) +
    (data.hashCode) +
    (hasMore == null ? 0 : hasMore!.hashCode) +
    (firstId == null ? 0 : firstId!.hashCode) +
    (lastId == null ? 0 : lastId!.hashCode);

  @override
  String toString() => 'ApiKeyList[object=$object, data=$data, hasMore=$hasMore, firstId=$firstId, lastId=$lastId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.object != null) {
      json[r'object'] = this.object;
    } else {
      json[r'object'] = null;
    }
      json[r'data'] = this.data;
    if (this.hasMore != null) {
      json[r'has_more'] = this.hasMore;
    } else {
      json[r'has_more'] = null;
    }
    if (this.firstId != null) {
      json[r'first_id'] = this.firstId;
    } else {
      json[r'first_id'] = null;
    }
    if (this.lastId != null) {
      json[r'last_id'] = this.lastId;
    } else {
      json[r'last_id'] = null;
    }
    return json;
  }

  /// Returns a new [ApiKeyList] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ApiKeyList? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ApiKeyList[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ApiKeyList[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ApiKeyList(
        object: mapValueOfType<String>(json, r'object'),
        data: AdminApiKey.listFromJson(json[r'data']),
        hasMore: mapValueOfType<bool>(json, r'has_more'),
        firstId: mapValueOfType<String>(json, r'first_id'),
        lastId: mapValueOfType<String>(json, r'last_id'),
      );
    }
    return null;
  }

  static List<ApiKeyList> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ApiKeyList>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ApiKeyList.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ApiKeyList> mapFromJson(dynamic json) {
    final map = <String, ApiKeyList>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ApiKeyList.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ApiKeyList-objects as value to a dart map
  static Map<String, List<ApiKeyList>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ApiKeyList>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ApiKeyList.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

