//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDeltaStepDetailsMessageCreationObject {
  /// Returns a new [RunStepDeltaStepDetailsMessageCreationObject] instance.
  RunStepDeltaStepDetailsMessageCreationObject({
    required this.type,
    this.messageCreation,
  });

  /// Always `message_creation`.
  RunStepDeltaStepDetailsMessageCreationObjectTypeEnum type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation? messageCreation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDeltaStepDetailsMessageCreationObject &&
    other.type == type &&
    other.messageCreation == messageCreation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (messageCreation == null ? 0 : messageCreation!.hashCode);

  @override
  String toString() => 'RunStepDeltaStepDetailsMessageCreationObject[type=$type, messageCreation=$messageCreation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    if (this.messageCreation != null) {
      json[r'message_creation'] = this.messageCreation;
    } else {
      json[r'message_creation'] = null;
    }
    return json;
  }

  /// Returns a new [RunStepDeltaStepDetailsMessageCreationObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDeltaStepDetailsMessageCreationObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDeltaStepDetailsMessageCreationObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDeltaStepDetailsMessageCreationObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDeltaStepDetailsMessageCreationObject(
        type: RunStepDeltaStepDetailsMessageCreationObjectTypeEnum.fromJson(json[r'type'])!,
        messageCreation: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.fromJson(json[r'message_creation']),
      );
    }
    return null;
  }

  static List<RunStepDeltaStepDetailsMessageCreationObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsMessageCreationObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsMessageCreationObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDeltaStepDetailsMessageCreationObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDeltaStepDetailsMessageCreationObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDeltaStepDetailsMessageCreationObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDeltaStepDetailsMessageCreationObject-objects as value to a dart map
  static Map<String, List<RunStepDeltaStepDetailsMessageCreationObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDeltaStepDetailsMessageCreationObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDeltaStepDetailsMessageCreationObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// Always `message_creation`.
class RunStepDeltaStepDetailsMessageCreationObjectTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RunStepDeltaStepDetailsMessageCreationObjectTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const messageCreation = RunStepDeltaStepDetailsMessageCreationObjectTypeEnum._(r'message_creation');

  /// List of all possible values in this [enum][RunStepDeltaStepDetailsMessageCreationObjectTypeEnum].
  static const values = <RunStepDeltaStepDetailsMessageCreationObjectTypeEnum>[
    messageCreation,
  ];

  static RunStepDeltaStepDetailsMessageCreationObjectTypeEnum? fromJson(dynamic value) => RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer().decode(value);

  static List<RunStepDeltaStepDetailsMessageCreationObjectTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDeltaStepDetailsMessageCreationObjectTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDeltaStepDetailsMessageCreationObjectTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RunStepDeltaStepDetailsMessageCreationObjectTypeEnum] to String,
/// and [decode] dynamic data back to [RunStepDeltaStepDetailsMessageCreationObjectTypeEnum].
class RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer {
  factory RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer() => _instance ??= const RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer._();

  const RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer._();

  String encode(RunStepDeltaStepDetailsMessageCreationObjectTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RunStepDeltaStepDetailsMessageCreationObjectTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RunStepDeltaStepDetailsMessageCreationObjectTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message_creation': return RunStepDeltaStepDetailsMessageCreationObjectTypeEnum.messageCreation;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer] instance.
  static RunStepDeltaStepDetailsMessageCreationObjectTypeEnumTypeTransformer? _instance;
}


