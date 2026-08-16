//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuningIntegration {
  /// Returns a new [FineTuningIntegration] instance.
  FineTuningIntegration({
    required this.type,
    required this.wandb,
  });

  /// The type of the integration being enabled for the fine-tuning job
  FineTuningIntegrationTypeEnum type;

  CreateFineTuningJobRequestIntegrationsInnerWandb wandb;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuningIntegration &&
    other.type == type &&
    other.wandb == wandb;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (wandb.hashCode);

  @override
  String toString() => 'FineTuningIntegration[type=$type, wandb=$wandb]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'wandb'] = this.wandb;
    return json;
  }

  /// Returns a new [FineTuningIntegration] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuningIntegration? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuningIntegration[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuningIntegration[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuningIntegration(
        type: FineTuningIntegrationTypeEnum.fromJson(json[r'type'])!,
        wandb: CreateFineTuningJobRequestIntegrationsInnerWandb.fromJson(json[r'wandb'])!,
      );
    }
    return null;
  }

  static List<FineTuningIntegration> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningIntegration>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningIntegration.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuningIntegration> mapFromJson(dynamic json) {
    final map = <String, FineTuningIntegration>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuningIntegration.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuningIntegration-objects as value to a dart map
  static Map<String, List<FineTuningIntegration>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuningIntegration>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuningIntegration.listFromJson(entry.value, growable: growable,);
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

/// The type of the integration being enabled for the fine-tuning job
class FineTuningIntegrationTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningIntegrationTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const wandb = FineTuningIntegrationTypeEnum._(r'wandb');

  /// List of all possible values in this [enum][FineTuningIntegrationTypeEnum].
  static const values = <FineTuningIntegrationTypeEnum>[
    wandb,
  ];

  static FineTuningIntegrationTypeEnum? fromJson(dynamic value) => FineTuningIntegrationTypeEnumTypeTransformer().decode(value);

  static List<FineTuningIntegrationTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningIntegrationTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningIntegrationTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningIntegrationTypeEnum] to String,
/// and [decode] dynamic data back to [FineTuningIntegrationTypeEnum].
class FineTuningIntegrationTypeEnumTypeTransformer {
  factory FineTuningIntegrationTypeEnumTypeTransformer() => _instance ??= const FineTuningIntegrationTypeEnumTypeTransformer._();

  const FineTuningIntegrationTypeEnumTypeTransformer._();

  String encode(FineTuningIntegrationTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningIntegrationTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningIntegrationTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'wandb': return FineTuningIntegrationTypeEnum.wandb;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningIntegrationTypeEnumTypeTransformer] instance.
  static FineTuningIntegrationTypeEnumTypeTransformer? _instance;
}


