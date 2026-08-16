//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeResponseCreateParamsToolsInner {
  /// Returns a new [RealtimeResponseCreateParamsToolsInner] instance.
  RealtimeResponseCreateParamsToolsInner({
    this.type,
    this.name,
    this.description,
    this.parameters,
  });

  /// The type of the tool, i.e. `function`.
  RealtimeResponseCreateParamsToolsInnerTypeEnum? type;

  /// The name of the function.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? description;

  /// Parameters of the function in JSON Schema.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? parameters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeResponseCreateParamsToolsInner &&
    other.type == type &&
    other.name == name &&
    other.description == description &&
    other.parameters == parameters;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type == null ? 0 : type!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (parameters == null ? 0 : parameters!.hashCode);

  @override
  String toString() => 'RealtimeResponseCreateParamsToolsInner[type=$type, name=$name, description=$description, parameters=$parameters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.parameters != null) {
      json[r'parameters'] = this.parameters;
    } else {
      json[r'parameters'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeResponseCreateParamsToolsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeResponseCreateParamsToolsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeResponseCreateParamsToolsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeResponseCreateParamsToolsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeResponseCreateParamsToolsInner(
        type: RealtimeResponseCreateParamsToolsInnerTypeEnum.fromJson(json[r'type']),
        name: mapValueOfType<String>(json, r'name'),
        description: mapValueOfType<String>(json, r'description'),
        parameters: mapValueOfType<Object>(json, r'parameters'),
      );
    }
    return null;
  }

  static List<RealtimeResponseCreateParamsToolsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParamsToolsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParamsToolsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeResponseCreateParamsToolsInner> mapFromJson(dynamic json) {
    final map = <String, RealtimeResponseCreateParamsToolsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeResponseCreateParamsToolsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeResponseCreateParamsToolsInner-objects as value to a dart map
  static Map<String, List<RealtimeResponseCreateParamsToolsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeResponseCreateParamsToolsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeResponseCreateParamsToolsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The type of the tool, i.e. `function`.
class RealtimeResponseCreateParamsToolsInnerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeResponseCreateParamsToolsInnerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const function_ = RealtimeResponseCreateParamsToolsInnerTypeEnum._(r'function');

  /// List of all possible values in this [enum][RealtimeResponseCreateParamsToolsInnerTypeEnum].
  static const values = <RealtimeResponseCreateParamsToolsInnerTypeEnum>[
    function_,
  ];

  static RealtimeResponseCreateParamsToolsInnerTypeEnum? fromJson(dynamic value) => RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer().decode(value);

  static List<RealtimeResponseCreateParamsToolsInnerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeResponseCreateParamsToolsInnerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeResponseCreateParamsToolsInnerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeResponseCreateParamsToolsInnerTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeResponseCreateParamsToolsInnerTypeEnum].
class RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer {
  factory RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer() => _instance ??= const RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer._();

  const RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer._();

  String encode(RealtimeResponseCreateParamsToolsInnerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeResponseCreateParamsToolsInnerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeResponseCreateParamsToolsInnerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'function': return RealtimeResponseCreateParamsToolsInnerTypeEnum.function_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer] instance.
  static RealtimeResponseCreateParamsToolsInnerTypeEnumTypeTransformer? _instance;
}


