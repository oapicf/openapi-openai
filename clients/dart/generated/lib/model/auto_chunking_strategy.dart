//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AutoChunkingStrategy {
  /// Returns a new [AutoChunkingStrategy] instance.
  AutoChunkingStrategy({
    required this.type,
  });

  /// Always `auto`.
  AutoChunkingStrategyTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AutoChunkingStrategy &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'AutoChunkingStrategy[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [AutoChunkingStrategy] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AutoChunkingStrategy? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AutoChunkingStrategy[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AutoChunkingStrategy[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AutoChunkingStrategy(
        type: AutoChunkingStrategyTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<AutoChunkingStrategy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AutoChunkingStrategy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AutoChunkingStrategy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AutoChunkingStrategy> mapFromJson(dynamic json) {
    final map = <String, AutoChunkingStrategy>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AutoChunkingStrategy.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AutoChunkingStrategy-objects as value to a dart map
  static Map<String, List<AutoChunkingStrategy>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AutoChunkingStrategy>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AutoChunkingStrategy.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// Always `auto`.
class AutoChunkingStrategyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AutoChunkingStrategyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = AutoChunkingStrategyTypeEnum._(r'auto');

  /// List of all possible values in this [enum][AutoChunkingStrategyTypeEnum].
  static const values = <AutoChunkingStrategyTypeEnum>[
    auto,
  ];

  static AutoChunkingStrategyTypeEnum? fromJson(dynamic value) => AutoChunkingStrategyTypeEnumTypeTransformer().decode(value);

  static List<AutoChunkingStrategyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AutoChunkingStrategyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AutoChunkingStrategyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AutoChunkingStrategyTypeEnum] to String,
/// and [decode] dynamic data back to [AutoChunkingStrategyTypeEnum].
class AutoChunkingStrategyTypeEnumTypeTransformer {
  factory AutoChunkingStrategyTypeEnumTypeTransformer() => _instance ??= const AutoChunkingStrategyTypeEnumTypeTransformer._();

  const AutoChunkingStrategyTypeEnumTypeTransformer._();

  String encode(AutoChunkingStrategyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AutoChunkingStrategyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AutoChunkingStrategyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return AutoChunkingStrategyTypeEnum.auto;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AutoChunkingStrategyTypeEnumTypeTransformer] instance.
  static AutoChunkingStrategyTypeEnumTypeTransformer? _instance;
}


