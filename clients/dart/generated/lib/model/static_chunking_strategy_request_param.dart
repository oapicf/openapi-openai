//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class StaticChunkingStrategyRequestParam {
  /// Returns a new [StaticChunkingStrategyRequestParam] instance.
  StaticChunkingStrategyRequestParam({
    required this.type,
    required this.static_,
  });

  /// Always `static`.
  StaticChunkingStrategyRequestParamTypeEnum type;

  StaticChunkingStrategy static_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is StaticChunkingStrategyRequestParam &&
    other.type == type &&
    other.static_ == static_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (static_.hashCode);

  @override
  String toString() => 'StaticChunkingStrategyRequestParam[type=$type, static_=$static_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'static'] = this.static_;
    return json;
  }

  /// Returns a new [StaticChunkingStrategyRequestParam] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static StaticChunkingStrategyRequestParam? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "StaticChunkingStrategyRequestParam[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "StaticChunkingStrategyRequestParam[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return StaticChunkingStrategyRequestParam(
        type: StaticChunkingStrategyRequestParamTypeEnum.fromJson(json[r'type'])!,
        static_: StaticChunkingStrategy.fromJson(json[r'static'])!,
      );
    }
    return null;
  }

  static List<StaticChunkingStrategyRequestParam> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StaticChunkingStrategyRequestParam>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StaticChunkingStrategyRequestParam.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, StaticChunkingStrategyRequestParam> mapFromJson(dynamic json) {
    final map = <String, StaticChunkingStrategyRequestParam>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = StaticChunkingStrategyRequestParam.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of StaticChunkingStrategyRequestParam-objects as value to a dart map
  static Map<String, List<StaticChunkingStrategyRequestParam>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<StaticChunkingStrategyRequestParam>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = StaticChunkingStrategyRequestParam.listFromJson(entry.value, growable: growable,);
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
class StaticChunkingStrategyRequestParamTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const StaticChunkingStrategyRequestParamTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const static_ = StaticChunkingStrategyRequestParamTypeEnum._(r'static');

  /// List of all possible values in this [enum][StaticChunkingStrategyRequestParamTypeEnum].
  static const values = <StaticChunkingStrategyRequestParamTypeEnum>[
    static_,
  ];

  static StaticChunkingStrategyRequestParamTypeEnum? fromJson(dynamic value) => StaticChunkingStrategyRequestParamTypeEnumTypeTransformer().decode(value);

  static List<StaticChunkingStrategyRequestParamTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <StaticChunkingStrategyRequestParamTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = StaticChunkingStrategyRequestParamTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [StaticChunkingStrategyRequestParamTypeEnum] to String,
/// and [decode] dynamic data back to [StaticChunkingStrategyRequestParamTypeEnum].
class StaticChunkingStrategyRequestParamTypeEnumTypeTransformer {
  factory StaticChunkingStrategyRequestParamTypeEnumTypeTransformer() => _instance ??= const StaticChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  const StaticChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  String encode(StaticChunkingStrategyRequestParamTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a StaticChunkingStrategyRequestParamTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  StaticChunkingStrategyRequestParamTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'static': return StaticChunkingStrategyRequestParamTypeEnum.static_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [StaticChunkingStrategyRequestParamTypeEnumTypeTransformer] instance.
  static StaticChunkingStrategyRequestParamTypeEnumTypeTransformer? _instance;
}


