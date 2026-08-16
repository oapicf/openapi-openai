//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AutoChunkingStrategyRequestParam {
  /// Returns a new [AutoChunkingStrategyRequestParam] instance.
  AutoChunkingStrategyRequestParam({
    required this.type,
  });

  /// Always `auto`.
  AutoChunkingStrategyRequestParamTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AutoChunkingStrategyRequestParam &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode);

  @override
  String toString() => 'AutoChunkingStrategyRequestParam[type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [AutoChunkingStrategyRequestParam] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AutoChunkingStrategyRequestParam? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AutoChunkingStrategyRequestParam[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AutoChunkingStrategyRequestParam[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AutoChunkingStrategyRequestParam(
        type: AutoChunkingStrategyRequestParamTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<AutoChunkingStrategyRequestParam> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AutoChunkingStrategyRequestParam>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AutoChunkingStrategyRequestParam.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AutoChunkingStrategyRequestParam> mapFromJson(dynamic json) {
    final map = <String, AutoChunkingStrategyRequestParam>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AutoChunkingStrategyRequestParam.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AutoChunkingStrategyRequestParam-objects as value to a dart map
  static Map<String, List<AutoChunkingStrategyRequestParam>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AutoChunkingStrategyRequestParam>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AutoChunkingStrategyRequestParam.listFromJson(entry.value, growable: growable,);
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
class AutoChunkingStrategyRequestParamTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AutoChunkingStrategyRequestParamTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = AutoChunkingStrategyRequestParamTypeEnum._(r'auto');

  /// List of all possible values in this [enum][AutoChunkingStrategyRequestParamTypeEnum].
  static const values = <AutoChunkingStrategyRequestParamTypeEnum>[
    auto,
  ];

  static AutoChunkingStrategyRequestParamTypeEnum? fromJson(dynamic value) => AutoChunkingStrategyRequestParamTypeEnumTypeTransformer().decode(value);

  static List<AutoChunkingStrategyRequestParamTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AutoChunkingStrategyRequestParamTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AutoChunkingStrategyRequestParamTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AutoChunkingStrategyRequestParamTypeEnum] to String,
/// and [decode] dynamic data back to [AutoChunkingStrategyRequestParamTypeEnum].
class AutoChunkingStrategyRequestParamTypeEnumTypeTransformer {
  factory AutoChunkingStrategyRequestParamTypeEnumTypeTransformer() => _instance ??= const AutoChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  const AutoChunkingStrategyRequestParamTypeEnumTypeTransformer._();

  String encode(AutoChunkingStrategyRequestParamTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AutoChunkingStrategyRequestParamTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AutoChunkingStrategyRequestParamTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return AutoChunkingStrategyRequestParamTypeEnum.auto;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AutoChunkingStrategyRequestParamTypeEnumTypeTransformer] instance.
  static AutoChunkingStrategyRequestParamTypeEnumTypeTransformer? _instance;
}


