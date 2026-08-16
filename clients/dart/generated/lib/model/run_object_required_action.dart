//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunObjectRequiredAction {
  /// Returns a new [RunObjectRequiredAction] instance.
  RunObjectRequiredAction({
    required this.type,
    required this.submitToolOutputs,
  });

  /// For now, this is always `submit_tool_outputs`.
  RunObjectRequiredActionTypeEnum type;

  RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunObjectRequiredAction &&
    other.type == type &&
    other.submitToolOutputs == submitToolOutputs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (submitToolOutputs.hashCode);

  @override
  String toString() => 'RunObjectRequiredAction[type=$type, submitToolOutputs=$submitToolOutputs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'submit_tool_outputs'] = this.submitToolOutputs;
    return json;
  }

  /// Returns a new [RunObjectRequiredAction] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunObjectRequiredAction? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunObjectRequiredAction[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunObjectRequiredAction[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunObjectRequiredAction(
        type: RunObjectRequiredActionTypeEnum.fromJson(json[r'type'])!,
        submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs.fromJson(json[r'submit_tool_outputs'])!,
      );
    }
    return null;
  }

  static List<RunObjectRequiredAction> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectRequiredAction>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectRequiredAction.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunObjectRequiredAction> mapFromJson(dynamic json) {
    final map = <String, RunObjectRequiredAction>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunObjectRequiredAction.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunObjectRequiredAction-objects as value to a dart map
  static Map<String, List<RunObjectRequiredAction>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunObjectRequiredAction>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunObjectRequiredAction.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'submit_tool_outputs',
  };
}

/// For now, this is always `submit_tool_outputs`.
class RunObjectRequiredActionTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunObjectRequiredActionTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const submitToolOutputs = RunObjectRequiredActionTypeEnum._(r'submit_tool_outputs');

  /// List of all possible values in this [enum][RunObjectRequiredActionTypeEnum].
  static const values = <RunObjectRequiredActionTypeEnum>[
    submitToolOutputs,
  ];

  static RunObjectRequiredActionTypeEnum? fromJson(dynamic value) => RunObjectRequiredActionTypeEnumTypeTransformer().decode(value);

  static List<RunObjectRequiredActionTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunObjectRequiredActionTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunObjectRequiredActionTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunObjectRequiredActionTypeEnum] to String,
/// and [decode] dynamic data back to [RunObjectRequiredActionTypeEnum].
class RunObjectRequiredActionTypeEnumTypeTransformer {
  factory RunObjectRequiredActionTypeEnumTypeTransformer() => _instance ??= const RunObjectRequiredActionTypeEnumTypeTransformer._();

  const RunObjectRequiredActionTypeEnumTypeTransformer._();

  String encode(RunObjectRequiredActionTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunObjectRequiredActionTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunObjectRequiredActionTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'submit_tool_outputs': return RunObjectRequiredActionTypeEnum.submitToolOutputs;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunObjectRequiredActionTypeEnumTypeTransformer] instance.
  static RunObjectRequiredActionTypeEnumTypeTransformer? _instance;
}


