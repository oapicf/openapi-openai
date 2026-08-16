//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ChunkingStrategyRequestParam {
  /// Returns a new [ChunkingStrategyRequestParam] instance.
  ChunkingStrategyRequestParam({
    required this.type,
    required this.static_,
  });

  /// Always `auto`.
  ChunkingStrategyRequestParamTypeEnum type;

  StaticChunkingStrategy static_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ChunkingStrategyRequestParam &&
    other.type == type &&
    other.static_ == static_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (static_.hashCode);

  @override
  String toString() => 'ChunkingStrategyRequestParam[type=$type, static_=$static_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'static'] = this.static_;
    return json;
  }

  /// Returns a new [ChunkingStrategyRequestParam] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ChunkingStrategyRequestParam? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ChunkingStrategyRequestParam[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ChunkingStrategyRequestParam[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ChunkingStrategyRequestParam(
        type: ChunkingStrategyRequestParamTypeEnum.fromJson(json[r'type'])!,
        static_: StaticChunkingStrategy.fromJson(json[r'static'])!,
      );
    }
    return null;
  }

  static List<ChunkingStrategyRequestParam> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChunkingStrategyRequestParam>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChunkingStrategyRequestParam.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ChunkingStrategyRequestParam> mapFromJson(dynamic json) {
    final map = <String, ChunkingStrategyRequestParam>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ChunkingStrategyRequestParam.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ChunkingStrategyRequestParam-objects as value to a dart map
  static Map<String, List<ChunkingStrategyRequestParam>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ChunkingStrategyRequestParam>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ChunkingStrategyRequestParam.listFromJson(entry.value, growable: growable,);
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

/// Always `auto`.
class ChunkingStrategyRequestParamTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ChunkingStrategyRequestParamTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = ChunkingStrategyRequestParamTypeEnum._(r'auto');
  static const static_ = ChunkingStrategyRequestParamTypeEnum._(r'static');

  /// List of all possible values in this [enum][ChunkingStrategyRequestParamTypeEnum].
  static const values = <ChunkingStrategyRequestParamTypeEnum>[
    auto,
    static_,
  ];

  static ChunkingStrategyRequestParamTypeEnum? fromJson(dynamic value) => ChunkingStrategyRequestParamTypeEnumTypeTransformer().decode(value);

  static List<ChunkingStrategyRequestParamTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChunkingStrategyRequestParamTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChunkingStrategyRequestParamTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChunkingStrategyRequestParamTypeEnum] to String,
/// and [decode] dynamic data back to [ChunkingStrategyRequestParamTypeEnum].
class ChunkingStrategyRequestParamTypeEnumTypeTransformer {
  factory ChunkingStrategyRequestParamTypeEnumTypeTransformer() => _instance ??= const ChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  const ChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  String encode(ChunkingStrategyRequestParamTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ChunkingStrategyRequestParamTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChunkingStrategyRequestParamTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return ChunkingStrategyRequestParamTypeEnum.auto;
        case r'static': return ChunkingStrategyRequestParamTypeEnum.static_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ChunkingStrategyRequestParamTypeEnumTypeTransformer] instance.
  static ChunkingStrategyRequestParamTypeEnumTypeTransformer? _instance;
}


