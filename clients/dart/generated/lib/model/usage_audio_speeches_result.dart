//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageAudioSpeechesResult {
  /// Returns a new [UsageAudioSpeechesResult] instance.
  UsageAudioSpeechesResult({
    required this.object,
    required this.characters,
    required this.numModelRequests,
    this.projectId,
    this.userId,
    this.apiKeyId,
    this.model,
  });

  UsageAudioSpeechesResultObjectEnum object;

  /// The number of characters processed.
  int characters;

  /// The count of requests made to the model.
  int numModelRequests;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  String? projectId;

  /// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  String? userId;

  /// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  String? apiKeyId;

  /// When `group_by=model`, this field provides the model name of the grouped usage result.
  String? model;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageAudioSpeechesResult &&
    other.object == object &&
    other.characters == characters &&
    other.numModelRequests == numModelRequests &&
    other.projectId == projectId &&
    other.userId == userId &&
    other.apiKeyId == apiKeyId &&
    other.model == model;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (characters.hashCode) +
    (numModelRequests.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (apiKeyId == null ? 0 : apiKeyId!.hashCode) +
    (model == null ? 0 : model!.hashCode);

  @override
  String toString() => 'UsageAudioSpeechesResult[object=$object, characters=$characters, numModelRequests=$numModelRequests, projectId=$projectId, userId=$userId, apiKeyId=$apiKeyId, model=$model]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'characters'] = this.characters;
      json[r'num_model_requests'] = this.numModelRequests;
    if (this.projectId != null) {
      json[r'project_id'] = this.projectId;
    } else {
      json[r'project_id'] = null;
    }
    if (this.userId != null) {
      json[r'user_id'] = this.userId;
    } else {
      json[r'user_id'] = null;
    }
    if (this.apiKeyId != null) {
      json[r'api_key_id'] = this.apiKeyId;
    } else {
      json[r'api_key_id'] = null;
    }
    if (this.model != null) {
      json[r'model'] = this.model;
    } else {
      json[r'model'] = null;
    }
    return json;
  }

  /// Returns a new [UsageAudioSpeechesResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageAudioSpeechesResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'object'), 'Required key "UsageAudioSpeechesResult[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "UsageAudioSpeechesResult[object]" has a null value in JSON.');
        assert(json.containsKey(r'characters'), 'Required key "UsageAudioSpeechesResult[characters]" is missing from JSON.');
        assert(json[r'characters'] != null, 'Required key "UsageAudioSpeechesResult[characters]" has a null value in JSON.');
        assert(json.containsKey(r'num_model_requests'), 'Required key "UsageAudioSpeechesResult[num_model_requests]" is missing from JSON.');
        assert(json[r'num_model_requests'] != null, 'Required key "UsageAudioSpeechesResult[num_model_requests]" has a null value in JSON.');
        return true;
      }());

      return UsageAudioSpeechesResult(
        object: UsageAudioSpeechesResultObjectEnum.fromJson(json[r'object'])!,
        characters: mapValueOfType<int>(json, r'characters')!,
        numModelRequests: mapValueOfType<int>(json, r'num_model_requests')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
        userId: mapValueOfType<String>(json, r'user_id'),
        apiKeyId: mapValueOfType<String>(json, r'api_key_id'),
        model: mapValueOfType<String>(json, r'model'),
      );
    }
    return null;
  }

  static List<UsageAudioSpeechesResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageAudioSpeechesResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageAudioSpeechesResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageAudioSpeechesResult> mapFromJson(dynamic json) {
    final map = <String, UsageAudioSpeechesResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageAudioSpeechesResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageAudioSpeechesResult-objects as value to a dart map
  static Map<String, List<UsageAudioSpeechesResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageAudioSpeechesResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageAudioSpeechesResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'characters',
    'num_model_requests',
  };
}


enum UsageAudioSpeechesResultObjectEnum {
  organizationPeriodUsagePeriodAudioSpeechesPeriodResult._(r'organization.usage.audio_speeches.result'),
  ;

  /// Instantiate a new enum with the provided value.
  const UsageAudioSpeechesResultObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UsageAudioSpeechesResultObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UsageAudioSpeechesResultObjectEnum? fromJson(dynamic value) => UsageAudioSpeechesResultObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UsageAudioSpeechesResultObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UsageAudioSpeechesResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageAudioSpeechesResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageAudioSpeechesResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageAudioSpeechesResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageAudioSpeechesResultObjectEnum].
class UsageAudioSpeechesResultObjectEnumTypeTransformer {
  factory UsageAudioSpeechesResultObjectEnumTypeTransformer() => _instance ??= const UsageAudioSpeechesResultObjectEnumTypeTransformer._();

  const UsageAudioSpeechesResultObjectEnumTypeTransformer._();

  String encode(UsageAudioSpeechesResultObjectEnum data) => data._value;

  /// Returns the instance of [UsageAudioSpeechesResultObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageAudioSpeechesResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is UsageAudioSpeechesResultObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'organization.usage.audio_speeches.result': return UsageAudioSpeechesResultObjectEnum.organizationPeriodUsagePeriodAudioSpeechesPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UsageAudioSpeechesResultObjectEnumTypeTransformer? _instance;
}


