//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteMessageResponse {
  /// Returns a new [DeleteMessageResponse] instance.
  DeleteMessageResponse({
    required this.id,
    required this.deleted,
    required this.object,
  });

  String id;

  bool deleted;

  DeleteMessageResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteMessageResponse &&
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
  String toString() => 'DeleteMessageResponse[id=$id, deleted=$deleted, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [DeleteMessageResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteMessageResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteMessageResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteMessageResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteMessageResponse(
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
        object: DeleteMessageResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<DeleteMessageResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteMessageResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteMessageResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteMessageResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteMessageResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteMessageResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteMessageResponse-objects as value to a dart map
  static Map<String, List<DeleteMessageResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteMessageResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteMessageResponse.listFromJson(entry.value, growable: growable,);
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


class DeleteMessageResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const DeleteMessageResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodMessagePeriodDeleted = DeleteMessageResponseObjectEnum._(r'thread.message.deleted');

  /// List of all possible values in this [enum][DeleteMessageResponseObjectEnum].
  static const values = <DeleteMessageResponseObjectEnum>[
    threadPeriodMessagePeriodDeleted,
  ];

  static DeleteMessageResponseObjectEnum? fromJson(dynamic value) => DeleteMessageResponseObjectEnumTypeTransformer().decode(value);

  static List<DeleteMessageResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteMessageResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteMessageResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteMessageResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteMessageResponseObjectEnum].
class DeleteMessageResponseObjectEnumTypeTransformer {
  factory DeleteMessageResponseObjectEnumTypeTransformer() => _instance ??= const DeleteMessageResponseObjectEnumTypeTransformer._();

  const DeleteMessageResponseObjectEnumTypeTransformer._();

  String encode(DeleteMessageResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeleteMessageResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteMessageResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.message.deleted': return DeleteMessageResponseObjectEnum.threadPeriodMessagePeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeleteMessageResponseObjectEnumTypeTransformer] instance.
  static DeleteMessageResponseObjectEnumTypeTransformer? _instance;
}


