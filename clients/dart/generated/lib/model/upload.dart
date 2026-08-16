//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Upload {
  /// Returns a new [Upload] instance.
  Upload({
    required this.id,
    required this.createdAt,
    required this.filename,
    required this.bytes,
    required this.purpose,
    required this.status,
    required this.expiresAt,
    this.object,
    this.file,
  });

  /// The Upload unique identifier, which can be referenced in API endpoints.
  String id;

  /// The Unix timestamp (in seconds) for when the Upload was created.
  int createdAt;

  /// The name of the file to be uploaded.
  String filename;

  /// The intended number of bytes to be uploaded.
  int bytes;

  /// The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  String purpose;

  /// The status of the Upload.
  UploadStatusEnum status;

  /// The Unix timestamp (in seconds) for when the Upload was created.
  int expiresAt;

  /// The object type, which is always \"upload\".
  UploadObjectEnum? object;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OpenAIFile? file;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Upload &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.filename == filename &&
    other.bytes == bytes &&
    other.purpose == purpose &&
    other.status == status &&
    other.expiresAt == expiresAt &&
    other.object == object &&
    other.file == file;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (createdAt.hashCode) +
    (filename.hashCode) +
    (bytes.hashCode) +
    (purpose.hashCode) +
    (status.hashCode) +
    (expiresAt.hashCode) +
    (object == null ? 0 : object!.hashCode) +
    (file == null ? 0 : file!.hashCode);

  @override
  String toString() => 'Upload[id=$id, createdAt=$createdAt, filename=$filename, bytes=$bytes, purpose=$purpose, status=$status, expiresAt=$expiresAt, object=$object, file=$file]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'created_at'] = this.createdAt;
      json[r'filename'] = this.filename;
      json[r'bytes'] = this.bytes;
      json[r'purpose'] = this.purpose;
      json[r'status'] = this.status;
      json[r'expires_at'] = this.expiresAt;
    if (this.object != null) {
      json[r'object'] = this.object;
    } else {
      json[r'object'] = null;
    }
    if (this.file != null) {
      json[r'file'] = this.file;
    } else {
      json[r'file'] = null;
    }
    return json;
  }

  /// Returns a new [Upload] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Upload? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Upload[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Upload[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Upload(
        id: mapValueOfType<String>(json, r'id')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        filename: mapValueOfType<String>(json, r'filename')!,
        bytes: mapValueOfType<int>(json, r'bytes')!,
        purpose: mapValueOfType<String>(json, r'purpose')!,
        status: UploadStatusEnum.fromJson(json[r'status'])!,
        expiresAt: mapValueOfType<int>(json, r'expires_at')!,
        object: UploadObjectEnum.fromJson(json[r'object']),
        file: OpenAIFile.fromJson(json[r'file']),
      );
    }
    return null;
  }

  static List<Upload> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Upload>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Upload.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Upload> mapFromJson(dynamic json) {
    final map = <String, Upload>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Upload.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Upload-objects as value to a dart map
  static Map<String, List<Upload>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Upload>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Upload.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'created_at',
    'filename',
    'bytes',
    'purpose',
    'status',
    'expires_at',
  };
}

/// The status of the Upload.
class UploadStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const UploadStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const pending = UploadStatusEnum._(r'pending');
  static const completed = UploadStatusEnum._(r'completed');
  static const cancelled = UploadStatusEnum._(r'cancelled');
  static const expired = UploadStatusEnum._(r'expired');

  /// List of all possible values in this [enum][UploadStatusEnum].
  static const values = <UploadStatusEnum>[
    pending,
    completed,
    cancelled,
    expired,
  ];

  static UploadStatusEnum? fromJson(dynamic value) => UploadStatusEnumTypeTransformer().decode(value);

  static List<UploadStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UploadStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UploadStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UploadStatusEnum] to String,
/// and [decode] dynamic data back to [UploadStatusEnum].
class UploadStatusEnumTypeTransformer {
  factory UploadStatusEnumTypeTransformer() => _instance ??= const UploadStatusEnumTypeTransformer._();

  const UploadStatusEnumTypeTransformer._();

  String encode(UploadStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UploadStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UploadStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'pending': return UploadStatusEnum.pending;
        case r'completed': return UploadStatusEnum.completed;
        case r'cancelled': return UploadStatusEnum.cancelled;
        case r'expired': return UploadStatusEnum.expired;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UploadStatusEnumTypeTransformer] instance.
  static UploadStatusEnumTypeTransformer? _instance;
}


/// The object type, which is always \"upload\".
class UploadObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UploadObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const upload = UploadObjectEnum._(r'upload');

  /// List of all possible values in this [enum][UploadObjectEnum].
  static const values = <UploadObjectEnum>[
    upload,
  ];

  static UploadObjectEnum? fromJson(dynamic value) => UploadObjectEnumTypeTransformer().decode(value);

  static List<UploadObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UploadObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UploadObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UploadObjectEnum] to String,
/// and [decode] dynamic data back to [UploadObjectEnum].
class UploadObjectEnumTypeTransformer {
  factory UploadObjectEnumTypeTransformer() => _instance ??= const UploadObjectEnumTypeTransformer._();

  const UploadObjectEnumTypeTransformer._();

  String encode(UploadObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UploadObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UploadObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'upload': return UploadObjectEnum.upload;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UploadObjectEnumTypeTransformer] instance.
  static UploadObjectEnumTypeTransformer? _instance;
}


