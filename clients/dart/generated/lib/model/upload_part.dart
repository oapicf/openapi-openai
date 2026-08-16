//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UploadPart {
  /// Returns a new [UploadPart] instance.
  UploadPart({
    required this.id,
    required this.createdAt,
    required this.uploadId,
    required this.object,
  });

  /// The upload Part unique identifier, which can be referenced in API endpoints.
  String id;

  /// The Unix timestamp (in seconds) for when the Part was created.
  int createdAt;

  /// The ID of the Upload object that this Part was added to.
  String uploadId;

  /// The object type, which is always `upload.part`.
  UploadPartObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UploadPart &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.uploadId == uploadId &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (createdAt.hashCode) +
    (uploadId.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'UploadPart[id=$id, createdAt=$createdAt, uploadId=$uploadId, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'created_at'] = this.createdAt;
      json[r'upload_id'] = this.uploadId;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [UploadPart] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UploadPart? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UploadPart[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UploadPart[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UploadPart(
        id: mapValueOfType<String>(json, r'id')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        uploadId: mapValueOfType<String>(json, r'upload_id')!,
        object: UploadPartObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<UploadPart> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UploadPart>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UploadPart.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UploadPart> mapFromJson(dynamic json) {
    final map = <String, UploadPart>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UploadPart.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UploadPart-objects as value to a dart map
  static Map<String, List<UploadPart>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UploadPart>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UploadPart.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'created_at',
    'upload_id',
    'object',
  };
}

/// The object type, which is always `upload.part`.
class UploadPartObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UploadPartObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const uploadPeriodPart = UploadPartObjectEnum._(r'upload.part');

  /// List of all possible values in this [enum][UploadPartObjectEnum].
  static const values = <UploadPartObjectEnum>[
    uploadPeriodPart,
  ];

  static UploadPartObjectEnum? fromJson(dynamic value) => UploadPartObjectEnumTypeTransformer().decode(value);

  static List<UploadPartObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UploadPartObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UploadPartObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UploadPartObjectEnum] to String,
/// and [decode] dynamic data back to [UploadPartObjectEnum].
class UploadPartObjectEnumTypeTransformer {
  factory UploadPartObjectEnumTypeTransformer() => _instance ??= const UploadPartObjectEnumTypeTransformer._();

  const UploadPartObjectEnumTypeTransformer._();

  String encode(UploadPartObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UploadPartObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UploadPartObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'upload.part': return UploadPartObjectEnum.uploadPeriodPart;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UploadPartObjectEnumTypeTransformer] instance.
  static UploadPartObjectEnumTypeTransformer? _instance;
}


