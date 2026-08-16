//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsMessageCreationObject {
  /// Returns a new [RunStepDetailsMessageCreationObject] instance.
  RunStepDetailsMessageCreationObject({
    required this.type,
    required this.messageCreation,
  });

  /// Always `message_creation`.
  RunStepDetailsMessageCreationObjectTypeEnum type;

  RunStepDetailsMessageCreationObjectMessageCreation messageCreation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsMessageCreationObject &&
    other.type == type &&
    other.messageCreation == messageCreation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (messageCreation.hashCode);

  @override
  String toString() => 'RunStepDetailsMessageCreationObject[type=$type, messageCreation=$messageCreation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'message_creation'] = this.messageCreation;
    return json;
  }

  /// Returns a new [RunStepDetailsMessageCreationObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsMessageCreationObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsMessageCreationObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsMessageCreationObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsMessageCreationObject(
        type: RunStepDetailsMessageCreationObjectTypeEnum.fromJson(json[r'type'])!,
        messageCreation: RunStepDetailsMessageCreationObjectMessageCreation.fromJson(json[r'message_creation'])!,
      );
    }
    return null;
  }

  static List<RunStepDetailsMessageCreationObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsMessageCreationObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsMessageCreationObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsMessageCreationObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsMessageCreationObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsMessageCreationObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsMessageCreationObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsMessageCreationObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsMessageCreationObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsMessageCreationObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'message_creation',
  };
}

/// Always `message_creation`.
class RunStepDetailsMessageCreationObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDetailsMessageCreationObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const messageCreation = RunStepDetailsMessageCreationObjectTypeEnum._(r'message_creation');

  /// List of all possible values in this [enum][RunStepDetailsMessageCreationObjectTypeEnum].
  static const values = <RunStepDetailsMessageCreationObjectTypeEnum>[
    messageCreation,
  ];

  static RunStepDetailsMessageCreationObjectTypeEnum? fromJson(dynamic value) => RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDetailsMessageCreationObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsMessageCreationObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsMessageCreationObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDetailsMessageCreationObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDetailsMessageCreationObjectTypeEnum].
class RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer {
  factory RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer._();

  const RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer._();

  String encode(RunStepDetailsMessageCreationObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDetailsMessageCreationObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDetailsMessageCreationObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message_creation': return RunStepDetailsMessageCreationObjectTypeEnum.messageCreation;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer] instance.
  static RunStepDetailsMessageCreationObjectTypeEnumTypeTransformer? _instance;
}


