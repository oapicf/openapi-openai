//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationResponse {
  /// Returns a new [CreateModerationResponse] instance.
  CreateModerationResponse({
    required this.id,
    required this.model,
    this.results = const [],
  });

  /// The unique identifier for the moderation request.
  String id;

  /// The model used to generate the moderation results.
  String model;

  /// A list of moderation objects.
  List<CreateModerationResponseResultsInner> results;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationResponse &&
    other.id == id &&
    other.model == model &&
    _deepEquality.equals(other.results, results);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (model.hashCode) +
    (results.hashCode);

  @override
  String toString() => 'CreateModerationResponse[id=$id, model=$model, results=$results]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'model'] = this.model;
      json[r'results'] = this.results;
    return json;
  }

  /// Returns a new [CreateModerationResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateModerationResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateModerationResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateModerationResponse(
        id: mapValueOfType<String>(json, r'id')!,
        model: mapValueOfType<String>(json, r'model')!,
        results: CreateModerationResponseResultsInner.listFromJson(json[r'results']),
      );
    }
    return null;
  }

  static List<CreateModerationResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationResponse> mapFromJson(dynamic json) {
    final map = <String, CreateModerationResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationResponse-objects as value to a dart map
  static Map<String, List<CreateModerationResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'model',
    'results',
  };
}

