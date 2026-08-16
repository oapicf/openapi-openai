//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFileSearchRankingOptionsObject {
  /// Returns a new [RunStepDetailsToolCallsFileSearchRankingOptionsObject] instance.
  RunStepDetailsToolCallsFileSearchRankingOptionsObject({
    required this.ranker,
    required this.scoreThreshold,
  });

  /// The ranker used for the file search.
  RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum ranker;

  /// The score threshold for the file search. All values must be a floating point number between 0 and 1.
  ///
  /// Minimum value: 0
  /// Maximum value: 1
  num scoreThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFileSearchRankingOptionsObject &&
    other.ranker == ranker &&
    other.scoreThreshold == scoreThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ranker.hashCode) +
    (scoreThreshold.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFileSearchRankingOptionsObject[ranker=$ranker, scoreThreshold=$scoreThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ranker'] = this.ranker;
      json[r'score_threshold'] = this.scoreThreshold;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFileSearchRankingOptionsObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFileSearchRankingOptionsObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsFileSearchRankingOptionsObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsFileSearchRankingOptionsObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsFileSearchRankingOptionsObject(
        ranker: RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum.fromJson(json[r'ranker'])!,
        scoreThreshold: num.parse('${json[r'score_threshold']}'),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFileSearchRankingOptionsObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchRankingOptionsObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchRankingOptionsObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFileSearchRankingOptionsObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFileSearchRankingOptionsObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFileSearchRankingOptionsObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFileSearchRankingOptionsObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFileSearchRankingOptionsObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFileSearchRankingOptionsObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFileSearchRankingOptionsObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ranker',
    'score_threshold',
  };
}

/// The ranker used for the file search.
class RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const default20240821 = RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum._(r'default_2024_08_21');

  /// List of all possible values in this [enum][RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum].
  static const values = <RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum>[
    default20240821,
  ];

  static RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum? fromJson(dynamic value) => RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer().decode(value);

  static List<RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum].
class RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer {
  factory RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer() => _instance ??= const RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer._();

  const RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer._();

  String encode(RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'default_2024_08_21': return RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnum.default20240821;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer] instance.
  static RunStepDetailsToolCallsFileSearchRankingOptionsObjectRankerEnumTypeTransformer? _instance;
}


