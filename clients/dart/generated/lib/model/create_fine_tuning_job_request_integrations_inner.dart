//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateFineTuningJobRequestIntegrationsInner {
  /// Returns a new [CreateFineTuningJobRequestIntegrationsInner] instance.
  CreateFineTuningJobRequestIntegrationsInner({
    required this.type,
    required this.wandb,
  });

  CreateFineTuningJobRequestIntegrationsInnerTypeEnum type;

  CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateFineTuningJobRequestIntegrationsInner &&
    other.type == type &&
    other.wandb == wandb;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (wandb.hashCode);

  @override
  String toString() => 'CreateFineTuningJobRequestIntegrationsInner[type=$type, wandb=$wandb]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'wandb'] = this.wandb;
    return json;
  }

  /// Returns a new [CreateFineTuningJobRequestIntegrationsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateFineTuningJobRequestIntegrationsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateFineTuningJobRequestIntegrationsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateFineTuningJobRequestIntegrationsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateFineTuningJobRequestIntegrationsInner(
        type: CreateFineTuningJobRequestIntegrationsInnerTypeEnum.fromJson(json[r'type'])!,
        wandb: CreateFineTuningJobRequestIntegrationsInnerWandb.fromJson(json[r'wandb'])!,
      );
    }
    return null;
  }

  static List<CreateFineTuningJobRequestIntegrationsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateFineTuningJobRequestIntegrationsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateFineTuningJobRequestIntegrationsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateFineTuningJobRequestIntegrationsInner> mapFromJson(dynamic json) {
    final map = <String, CreateFineTuningJobRequestIntegrationsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateFineTuningJobRequestIntegrationsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateFineTuningJobRequestIntegrationsInner-objects as value to a dart map
  static Map<String, List<CreateFineTuningJobRequestIntegrationsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateFineTuningJobRequestIntegrationsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateFineTuningJobRequestIntegrationsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'wandb',
  };
}


class CreateFineTuningJobRequestIntegrationsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateFineTuningJobRequestIntegrationsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const wandb = CreateFineTuningJobRequestIntegrationsInnerTypeEnum._(r'wandb');

  /// List of all possible values in this [enum][CreateFineTuningJobRequestIntegrationsInnerTypeEnum].
  static const values = <CreateFineTuningJobRequestIntegrationsInnerTypeEnum>[
    wandb,
  ];

  static CreateFineTuningJobRequestIntegrationsInnerTypeEnum? fromJson(dynamic value) => CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer().decode(value);

  static List<CreateFineTuningJobRequestIntegrationsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateFineTuningJobRequestIntegrationsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateFineTuningJobRequestIntegrationsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateFineTuningJobRequestIntegrationsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [CreateFineTuningJobRequestIntegrationsInnerTypeEnum].
class CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer {
  factory CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer() => _instance ??= const CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer._();

  const CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer._();

  String encode(CreateFineTuningJobRequestIntegrationsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateFineTuningJobRequestIntegrationsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateFineTuningJobRequestIntegrationsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'wandb': return CreateFineTuningJobRequestIntegrationsInnerTypeEnum.wandb;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer] instance.
  static CreateFineTuningJobRequestIntegrationsInnerTypeEnumTypeTransformer? _instance;
}


