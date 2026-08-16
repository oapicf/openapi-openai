//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteThreadResponse {
  /// Returns a new [DeleteThreadResponse] instance.
  DeleteThreadResponse({
    required this.id,
    required this.deleted,
    required this.object,
  });

  String id;

  bool deleted;

  DeleteThreadResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteThreadResponse &&
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
  String toString() => 'DeleteThreadResponse[id=$id, deleted=$deleted, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [DeleteThreadResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteThreadResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteThreadResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteThreadResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteThreadResponse(
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
        object: DeleteThreadResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<DeleteThreadResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteThreadResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteThreadResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteThreadResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteThreadResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteThreadResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteThreadResponse-objects as value to a dart map
  static Map<String, List<DeleteThreadResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteThreadResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteThreadResponse.listFromJson(entry.value, growable: growable,);
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


class DeleteThreadResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const DeleteThreadResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodDeleted = DeleteThreadResponseObjectEnum._(r'thread.deleted');

  /// List of all possible values in this [enum][DeleteThreadResponseObjectEnum].
  static const values = <DeleteThreadResponseObjectEnum>[
    threadPeriodDeleted,
  ];

  static DeleteThreadResponseObjectEnum? fromJson(dynamic value) => DeleteThreadResponseObjectEnumTypeTransformer().decode(value);

  static List<DeleteThreadResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteThreadResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteThreadResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteThreadResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteThreadResponseObjectEnum].
class DeleteThreadResponseObjectEnumTypeTransformer {
  factory DeleteThreadResponseObjectEnumTypeTransformer() => _instance ??= const DeleteThreadResponseObjectEnumTypeTransformer._();

  const DeleteThreadResponseObjectEnumTypeTransformer._();

  String encode(DeleteThreadResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeleteThreadResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteThreadResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.deleted': return DeleteThreadResponseObjectEnum.threadPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeleteThreadResponseObjectEnumTypeTransformer] instance.
  static DeleteThreadResponseObjectEnumTypeTransformer? _instance;
}


