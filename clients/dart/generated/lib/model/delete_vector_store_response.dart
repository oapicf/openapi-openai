//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteVectorStoreResponse {
  /// Returns a new [DeleteVectorStoreResponse] instance.
  DeleteVectorStoreResponse({
    required this.id,
    required this.deleted,
    required this.object,
  });

  String id;

  bool deleted;

  DeleteVectorStoreResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteVectorStoreResponse &&
    other.id == id &&
    other.deleted == deleted &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (deleted.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'DeleteVectorStoreResponse[id=$id, deleted=$deleted, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [DeleteVectorStoreResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteVectorStoreResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteVectorStoreResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteVectorStoreResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteVectorStoreResponse(
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
        object: DeleteVectorStoreResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<DeleteVectorStoreResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteVectorStoreResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteVectorStoreResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteVectorStoreResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteVectorStoreResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteVectorStoreResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteVectorStoreResponse-objects as value to a dart map
  static Map<String, List<DeleteVectorStoreResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteVectorStoreResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteVectorStoreResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'deleted',
    'object',
  };
}


class DeleteVectorStoreResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const DeleteVectorStoreResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const vectorStorePeriodDeleted = DeleteVectorStoreResponseObjectEnum._(r'vector_store.deleted');

  /// List of all possible values in this [enum][DeleteVectorStoreResponseObjectEnum].
  static const values = <DeleteVectorStoreResponseObjectEnum>[
    vectorStorePeriodDeleted,
  ];

  static DeleteVectorStoreResponseObjectEnum? fromJson(dynamic value) => DeleteVectorStoreResponseObjectEnumTypeTransformer().decode(value);

  static List<DeleteVectorStoreResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteVectorStoreResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteVectorStoreResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteVectorStoreResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteVectorStoreResponseObjectEnum].
class DeleteVectorStoreResponseObjectEnumTypeTransformer {
  factory DeleteVectorStoreResponseObjectEnumTypeTransformer() => _instance ??= const DeleteVectorStoreResponseObjectEnumTypeTransformer._();

  const DeleteVectorStoreResponseObjectEnumTypeTransformer._();

  String encode(DeleteVectorStoreResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeleteVectorStoreResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteVectorStoreResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'vector_store.deleted': return DeleteVectorStoreResponseObjectEnum.vectorStorePeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeleteVectorStoreResponseObjectEnumTypeTransformer] instance.
  static DeleteVectorStoreResponseObjectEnumTypeTransformer? _instance;
}


