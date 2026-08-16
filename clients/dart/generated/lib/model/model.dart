//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Model {
  /// Returns a new [Model] instance.
  Model({
    required this.id,
    required this.created,
    required this.object,
    required this.ownedBy,
  });

  /// The model identifier, which can be referenced in the API endpoints.
  String id;

  /// The Unix timestamp (in seconds) when the model was created.
  int created;

  /// The object type, which is always \"model\".
  ModelObjectEnum object;

  /// The organization that owns the model.
  String ownedBy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Model &&
    other.id == id &&
    other.created == created &&
    other.object == object &&
    other.ownedBy == ownedBy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (created.hashCode) +
    (object.hashCode) +
    (ownedBy.hashCode);

  @override
  String toString() => 'Model[id=$id, created=$created, object=$object, ownedBy=$ownedBy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'created'] = this.created;
      json[r'object'] = this.object;
      json[r'owned_by'] = this.ownedBy;
    return json;
  }

  /// Returns a new [Model] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Model? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Model[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Model[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Model(
        id: mapValueOfType<String>(json, r'id')!,
        created: mapValueOfType<int>(json, r'created')!,
        object: ModelObjectEnum.fromJson(json[r'object'])!,
        ownedBy: mapValueOfType<String>(json, r'owned_by')!,
      );
    }
    return null;
  }

  static List<Model> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Model>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Model.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Model> mapFromJson(dynamic json) {
    final map = <String, Model>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Model.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Model-objects as value to a dart map
  static Map<String, List<Model>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Model>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Model.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'created',
    'object',
    'owned_by',
  };
}

/// The object type, which is always \"model\".
class ModelObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ModelObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const model = ModelObjectEnum._(r'model');

  /// List of all possible values in this [enum][ModelObjectEnum].
  static const values = <ModelObjectEnum>[
    model,
  ];

  static ModelObjectEnum? fromJson(dynamic value) => ModelObjectEnumTypeTransformer().decode(value);

  static List<ModelObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ModelObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ModelObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ModelObjectEnum] to String,
/// and [decode] dynamic data back to [ModelObjectEnum].
class ModelObjectEnumTypeTransformer {
  factory ModelObjectEnumTypeTransformer() => _instance ??= const ModelObjectEnumTypeTransformer._();

  const ModelObjectEnumTypeTransformer._();

  String encode(ModelObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ModelObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ModelObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'model': return ModelObjectEnum.model;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ModelObjectEnumTypeTransformer] instance.
  static ModelObjectEnumTypeTransformer? _instance;
}


