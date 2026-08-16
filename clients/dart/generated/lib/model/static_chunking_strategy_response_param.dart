//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StaticChunkingStrategyResponseParam {
  /// Returns a new [StaticChunkingStrategyResponseParam] instance.
  StaticChunkingStrategyResponseParam({
    required this.type,
    required this.static_,
  });

  /// Always `static`.
  StaticChunkingStrategyResponseParamTypeEnum type;

  StaticChunkingStrategy static_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StaticChunkingStrategyResponseParam &&
    other.type == type &&
    other.static_ == static_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (static_.hashCode);

  @override
  String toString() => 'StaticChunkingStrategyResponseParam[type=$type, static_=$static_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'static'] = this.static_;
    return json;
  }

  /// Returns a new [StaticChunkingStrategyResponseParam] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StaticChunkingStrategyResponseParam? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "StaticChunkingStrategyResponseParam[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "StaticChunkingStrategyResponseParam[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return StaticChunkingStrategyResponseParam(
        type: StaticChunkingStrategyResponseParamTypeEnum.fromJson(json[r'type'])!,
        static_: StaticChunkingStrategy.fromJson(json[r'static'])!,
      );
    }
    return null;
  }

  static List<StaticChunkingStrategyResponseParam> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StaticChunkingStrategyResponseParam>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StaticChunkingStrategyResponseParam.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StaticChunkingStrategyResponseParam> mapFromJson(dynamic json) {
    final map = <String, StaticChunkingStrategyResponseParam>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StaticChunkingStrategyResponseParam.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StaticChunkingStrategyResponseParam-objects as value to a dart map
  static Map<String, List<StaticChunkingStrategyResponseParam>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StaticChunkingStrategyResponseParam>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StaticChunkingStrategyResponseParam.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'static',
  };
}

/// Always `static`.
class StaticChunkingStrategyResponseParamTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const StaticChunkingStrategyResponseParamTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const static_ = StaticChunkingStrategyResponseParamTypeEnum._(r'static');

  /// List of all possible values in this [enum][StaticChunkingStrategyResponseParamTypeEnum].
  static const values = <StaticChunkingStrategyResponseParamTypeEnum>[
    static_,
  ];

  static StaticChunkingStrategyResponseParamTypeEnum? fromJson(dynamic value) => StaticChunkingStrategyResponseParamTypeEnumTypeTransformer().decode(value);

  static List<StaticChunkingStrategyResponseParamTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StaticChunkingStrategyResponseParamTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StaticChunkingStrategyResponseParamTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [StaticChunkingStrategyResponseParamTypeEnum] to String,
/// and [decode] dynamic data back to [StaticChunkingStrategyResponseParamTypeEnum].
class StaticChunkingStrategyResponseParamTypeEnumTypeTransformer {
  factory StaticChunkingStrategyResponseParamTypeEnumTypeTransformer() => _instance ??= const StaticChunkingStrategyResponseParamTypeEnumTypeTransformer._();

  const StaticChunkingStrategyResponseParamTypeEnumTypeTransformer._();

  String encode(StaticChunkingStrategyResponseParamTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a StaticChunkingStrategyResponseParamTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  StaticChunkingStrategyResponseParamTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'static': return StaticChunkingStrategyResponseParamTypeEnum.static_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [StaticChunkingStrategyResponseParamTypeEnumTypeTransformer] instance.
  static StaticChunkingStrategyResponseParamTypeEnumTypeTransformer? _instance;
}


