//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunObjectIncompleteDetails {
  /// Returns a new [RunObjectIncompleteDetails] instance.
  RunObjectIncompleteDetails({
    this.reason,
  });

  /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  RunObjectIncompleteDetailsReasonEnum? reason;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunObjectIncompleteDetails &&
    other.reason == reason;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (reason == null ? 0 : reason!.hashCode);

  @override
  String toString() => 'RunObjectIncompleteDetails[reason=$reason]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.reason != null) {
      json[r'reason'] = this.reason;
    } else {
      json[r'reason'] = null;
    }
    return json;
  }

  /// Returns a new [RunObjectIncompleteDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunObjectIncompleteDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunObjectIncompleteDetails[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunObjectIncompleteDetails[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunObjectIncompleteDetails(
        reason: RunObjectIncompleteDetailsReasonEnum.fromJson(json[r'reason']),
      );
    }
    return null;
  }

  static List<RunObjectIncompleteDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectIncompleteDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectIncompleteDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunObjectIncompleteDetails> mapFromJson(dynamic json) {
    final map = <String, RunObjectIncompleteDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunObjectIncompleteDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunObjectIncompleteDetails-objects as value to a dart map
  static Map<String, List<RunObjectIncompleteDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunObjectIncompleteDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunObjectIncompleteDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
class RunObjectIncompleteDetailsReasonEnum {
  /// Instantiate a new enum with the provided [value].
  const RunObjectIncompleteDetailsReasonEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const maxCompletionTokens = RunObjectIncompleteDetailsReasonEnum._(r'max_completion_tokens');
  static const maxPromptTokens = RunObjectIncompleteDetailsReasonEnum._(r'max_prompt_tokens');

  /// List of all possible values in this [enum][RunObjectIncompleteDetailsReasonEnum].
  static const values = <RunObjectIncompleteDetailsReasonEnum>[
    maxCompletionTokens,
    maxPromptTokens,
  ];

  static RunObjectIncompleteDetailsReasonEnum? fromJson(dynamic value) => RunObjectIncompleteDetailsReasonEnumTypeTransformer().decode(value);

  static List<RunObjectIncompleteDetailsReasonEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectIncompleteDetailsReasonEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectIncompleteDetailsReasonEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunObjectIncompleteDetailsReasonEnum] to String,
/// and [decode] dynamic data back to [RunObjectIncompleteDetailsReasonEnum].
class RunObjectIncompleteDetailsReasonEnumTypeTransformer {
  factory RunObjectIncompleteDetailsReasonEnumTypeTransformer() => _instance ??= const RunObjectIncompleteDetailsReasonEnumTypeTransformer._();

  const RunObjectIncompleteDetailsReasonEnumTypeTransformer._();

  String encode(RunObjectIncompleteDetailsReasonEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunObjectIncompleteDetailsReasonEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunObjectIncompleteDetailsReasonEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'max_completion_tokens': return RunObjectIncompleteDetailsReasonEnum.maxCompletionTokens;
        case r'max_prompt_tokens': return RunObjectIncompleteDetailsReasonEnum.maxPromptTokens;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunObjectIncompleteDetailsReasonEnumTypeTransformer] instance.
  static RunObjectIncompleteDetailsReasonEnumTypeTransformer? _instance;
}


