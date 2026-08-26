//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteFileResponse {
  /// Returns a new [DeleteFileResponse] instance.
  DeleteFileResponse({
    required this.id,
    required this.object,
    required this.deleted,
  });

  String id;

  DeleteFileResponseObjectEnum object;

  bool deleted;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteFileResponse &&
    other.id == id &&
    other.object == object &&
    other.deleted == deleted;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (object.hashCode) +
    (deleted.hashCode);

  @override
  String toString() => 'DeleteFileResponse[id=$id, object=$object, deleted=$deleted]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'object'] = this.object;
      json[r'deleted'] = this.deleted;
    return json;
  }

  /// Returns a new [DeleteFileResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteFileResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "DeleteFileResponse[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "DeleteFileResponse[id]" has a null value in JSON.');
        assert(json.containsKey(r'object'), 'Required key "DeleteFileResponse[object]" is missing from JSON.');
        assert(json[r'object'] != null, 'Required key "DeleteFileResponse[object]" has a null value in JSON.');
        assert(json.containsKey(r'deleted'), 'Required key "DeleteFileResponse[deleted]" is missing from JSON.');
        assert(json[r'deleted'] != null, 'Required key "DeleteFileResponse[deleted]" has a null value in JSON.');
        return true;
      }());

      return DeleteFileResponse(
        id: mapValueOfType<String>(json, r'id')!,
        object: DeleteFileResponseObjectEnum.fromJson(json[r'object'])!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
      );
    }
    return null;
  }

  static List<DeleteFileResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteFileResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteFileResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteFileResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteFileResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteFileResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteFileResponse-objects as value to a dart map
  static Map<String, List<DeleteFileResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteFileResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteFileResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'object',
    'deleted',
  };
}


enum DeleteFileResponseObjectEnum {
  file._(r'file'),
  ;

  /// Instantiate a new enum with the provided value.
  const DeleteFileResponseObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [DeleteFileResponseObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static DeleteFileResponseObjectEnum? fromJson(dynamic value) => DeleteFileResponseObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [DeleteFileResponseObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<DeleteFileResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteFileResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteFileResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteFileResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteFileResponseObjectEnum].
class DeleteFileResponseObjectEnumTypeTransformer {
  factory DeleteFileResponseObjectEnumTypeTransformer() => _instance ??= const DeleteFileResponseObjectEnumTypeTransformer._();

  const DeleteFileResponseObjectEnumTypeTransformer._();

  String encode(DeleteFileResponseObjectEnum data) => data._value;

  /// Returns the instance of [DeleteFileResponseObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteFileResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is DeleteFileResponseObjectEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'file': return DeleteFileResponseObjectEnum.file;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static DeleteFileResponseObjectEnumTypeTransformer? _instance;
}


