//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuneMethod {
  /// Returns a new [FineTuneMethod] instance.
  FineTuneMethod({
    this.type,
    this.supervised,
    this.dpo,
  });

  /// The type of method. Is either `supervised` or `dpo`.
  FineTuneMethodTypeEnum? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FineTuneSupervisedMethod? supervised;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FineTuneDPOMethod? dpo;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuneMethod &&
    other.type == type &&
    other.supervised == supervised &&
    other.dpo == dpo;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (supervised == null ? 0 : supervised!.hashCode) +
    (dpo == null ? 0 : dpo!.hashCode);

  @override
  String toString() => 'FineTuneMethod[type=$type, supervised=$supervised, dpo=$dpo]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.supervised != null) {
      json[r'supervised'] = this.supervised;
    } else {
      json[r'supervised'] = null;
    }
    if (this.dpo != null) {
      json[r'dpo'] = this.dpo;
    } else {
      json[r'dpo'] = null;
    }
    return json;
  }

  /// Returns a new [FineTuneMethod] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuneMethod? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuneMethod[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuneMethod[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuneMethod(
        type: FineTuneMethodTypeEnum.fromJson(json[r'type']),
        supervised: mapValueOfType<FineTuneSupervisedMethod>(json, r'supervised'),
        dpo: mapValueOfType<FineTuneDPOMethod>(json, r'dpo'),
      );
    }
    return null;
  }

  static List<FineTuneMethod> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuneMethod>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuneMethod.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuneMethod> mapFromJson(dynamic json) {
    final map = <String, FineTuneMethod>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuneMethod.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuneMethod-objects as value to a dart map
  static Map<String, List<FineTuneMethod>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuneMethod>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuneMethod.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of method. Is either `supervised` or `dpo`.
class FineTuneMethodTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuneMethodTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const supervised = FineTuneMethodTypeEnum._(r'supervised');
  static const dpo = FineTuneMethodTypeEnum._(r'dpo');

  /// List of all possible values in this [enum][FineTuneMethodTypeEnum].
  static const values = <FineTuneMethodTypeEnum>[
    supervised,
    dpo,
  ];

  static FineTuneMethodTypeEnum? fromJson(dynamic value) => FineTuneMethodTypeEnumTypeTransformer().decode(value);

  static List<FineTuneMethodTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuneMethodTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuneMethodTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuneMethodTypeEnum] to String,
/// and [decode] dynamic data back to [FineTuneMethodTypeEnum].
class FineTuneMethodTypeEnumTypeTransformer {
  factory FineTuneMethodTypeEnumTypeTransformer() => _instance ??= const FineTuneMethodTypeEnumTypeTransformer._();

  const FineTuneMethodTypeEnumTypeTransformer._();

  String encode(FineTuneMethodTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuneMethodTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuneMethodTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'supervised': return FineTuneMethodTypeEnum.supervised;
        case r'dpo': return FineTuneMethodTypeEnum.dpo;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuneMethodTypeEnumTypeTransformer] instance.
  static FineTuneMethodTypeEnumTypeTransformer? _instance;
}


