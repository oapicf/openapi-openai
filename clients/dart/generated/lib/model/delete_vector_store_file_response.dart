//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteVectorStoreFileResponse {
  /// Returns a new [DeleteVectorStoreFileResponse] instance.
  DeleteVectorStoreFileResponse({
    required this.id,
    required this.deleted,
    required this.object,
  });

  String id;

  bool deleted;

  DeleteVectorStoreFileResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteVectorStoreFileResponse &&
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
  String toString() => 'DeleteVectorStoreFileResponse[id=$id, deleted=$deleted, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [DeleteVectorStoreFileResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteVectorStoreFileResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteVectorStoreFileResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteVectorStoreFileResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteVectorStoreFileResponse(
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
        object: DeleteVectorStoreFileResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<DeleteVectorStoreFileResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteVectorStoreFileResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteVectorStoreFileResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteVectorStoreFileResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteVectorStoreFileResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteVectorStoreFileResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteVectorStoreFileResponse-objects as value to a dart map
  static Map<String, List<DeleteVectorStoreFileResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteVectorStoreFileResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteVectorStoreFileResponse.listFromJson(entry.value, growable: growable,);
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


class DeleteVectorStoreFileResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const DeleteVectorStoreFileResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const vectorStorePeriodFilePeriodDeleted = DeleteVectorStoreFileResponseObjectEnum._(r'vector_store.file.deleted');

  /// List of all possible values in this [enum][DeleteVectorStoreFileResponseObjectEnum].
  static const values = <DeleteVectorStoreFileResponseObjectEnum>[
    vectorStorePeriodFilePeriodDeleted,
  ];

  static DeleteVectorStoreFileResponseObjectEnum? fromJson(dynamic value) => DeleteVectorStoreFileResponseObjectEnumTypeTransformer().decode(value);

  static List<DeleteVectorStoreFileResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteVectorStoreFileResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteVectorStoreFileResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteVectorStoreFileResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteVectorStoreFileResponseObjectEnum].
class DeleteVectorStoreFileResponseObjectEnumTypeTransformer {
  factory DeleteVectorStoreFileResponseObjectEnumTypeTransformer() => _instance ??= const DeleteVectorStoreFileResponseObjectEnumTypeTransformer._();

  const DeleteVectorStoreFileResponseObjectEnumTypeTransformer._();

  String encode(DeleteVectorStoreFileResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeleteVectorStoreFileResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteVectorStoreFileResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'vector_store.file.deleted': return DeleteVectorStoreFileResponseObjectEnum.vectorStorePeriodFilePeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeleteVectorStoreFileResponseObjectEnumTypeTransformer] instance.
  static DeleteVectorStoreFileResponseObjectEnumTypeTransformer? _instance;
}


