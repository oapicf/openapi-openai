//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteAssistantResponse {
  /// Returns a new [DeleteAssistantResponse] instance.
  DeleteAssistantResponse({
    required this.id,
    required this.deleted,
    required this.object,
  });

  String id;

  bool deleted;

  DeleteAssistantResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteAssistantResponse &&
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
  String toString() => 'DeleteAssistantResponse[id=$id, deleted=$deleted, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'deleted'] = this.deleted;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [DeleteAssistantResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteAssistantResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteAssistantResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteAssistantResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteAssistantResponse(
        id: mapValueOfType<String>(json, r'id')!,
        deleted: mapValueOfType<bool>(json, r'deleted')!,
        object: DeleteAssistantResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<DeleteAssistantResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteAssistantResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteAssistantResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteAssistantResponse> mapFromJson(dynamic json) {
    final map = <String, DeleteAssistantResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteAssistantResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteAssistantResponse-objects as value to a dart map
  static Map<String, List<DeleteAssistantResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteAssistantResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteAssistantResponse.listFromJson(entry.value, growable: growable,);
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


class DeleteAssistantResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const DeleteAssistantResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const assistantPeriodDeleted = DeleteAssistantResponseObjectEnum._(r'assistant.deleted');

  /// List of all possible values in this [enum][DeleteAssistantResponseObjectEnum].
  static const values = <DeleteAssistantResponseObjectEnum>[
    assistantPeriodDeleted,
  ];

  static DeleteAssistantResponseObjectEnum? fromJson(dynamic value) => DeleteAssistantResponseObjectEnumTypeTransformer().decode(value);

  static List<DeleteAssistantResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteAssistantResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteAssistantResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeleteAssistantResponseObjectEnum] to String,
/// and [decode] dynamic data back to [DeleteAssistantResponseObjectEnum].
class DeleteAssistantResponseObjectEnumTypeTransformer {
  factory DeleteAssistantResponseObjectEnumTypeTransformer() => _instance ??= const DeleteAssistantResponseObjectEnumTypeTransformer._();

  const DeleteAssistantResponseObjectEnumTypeTransformer._();

  String encode(DeleteAssistantResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DeleteAssistantResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeleteAssistantResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'assistant.deleted': return DeleteAssistantResponseObjectEnum.assistantPeriodDeleted;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DeleteAssistantResponseObjectEnumTypeTransformer] instance.
  static DeleteAssistantResponseObjectEnumTypeTransformer? _instance;
}


