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
        assert(json.containsKey(r'id'), 'Required key "Upload[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Upload[id]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "Upload[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "Upload[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'filename'), 'Required key "Upload[filename]" is missing from JSON.');
        assert(json[r'filename'] != null, 'Required key "Upload[filename]" has a null value in JSON.');
        assert(json.containsKey(r'bytes'), 'Required key "Upload[bytes]" is missing from JSON.');
        assert(json[r'bytes'] != null, 'Required key "Upload[bytes]" has a null value in JSON.');
        assert(json.containsKey(r'purpose'), 'Required key "Upload[purpose]" is missing from JSON.');
        assert(json[r'purpose'] != null, 'Required key "Upload[purpose]" has a null value in JSON.');
        assert(json.containsKey(r'status'), 'Required key "Upload[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "Upload[status]" has a null value in JSON.');
        assert(json.containsKey(r'expires_at'), 'Required key "Upload[expires_at]" is missing from JSON.');
        assert(json[r'expires_at'] != null, 'Required key "Upload[expires_at]" has a null value in JSON.');
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
enum UploadStatusEnum {
  pending._(r'pending'),
  completed._(r'completed'),
  cancelled._(r'cancelled'),
  expired._(r'expired'),
  ;

  /// Instantiate a new enum with the provided value.
  const UploadStatusEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UploadStatusEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UploadStatusEnum? fromJson(dynamic value) => UploadStatusEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UploadStatusEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(UploadStatusEnum data) => data._value;

  /// Returns the instance of [UploadStatusEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UploadStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is UploadStatusEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static UploadStatusEnumTypeTransformer? _instance;
}


/// The object type, which is always \"upload\".
enum UploadObjectEnum {
  upload._(r'upload'),
  ;

  /// Instantiate a new enum with the provided value.
  const UploadObjectEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UploadObjectEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UploadObjectEnum? fromJson(dynamic value) => UploadObjectEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UploadObjectEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(UploadObjectEnum data) => data._value;

  /// Returns the instance of [UploadObjectEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UploadObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is UploadObjectEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static UploadObjectEnumTypeTransformer? _instance;
}


