//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateUploadRequest {
  /// Returns a new [CreateUploadRequest] instance.
  CreateUploadRequest({
    required this.filename,
    required this.purpose,
    required this.bytes,
    required this.mimeType,
  });

  /// The name of the file to upload. 
  String filename;

  /// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  CreateUploadRequestPurposeEnum purpose;

  /// The number of bytes in the file you are uploading. 
  int bytes;

  /// The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  String mimeType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateUploadRequest &&
    other.filename == filename &&
    other.purpose == purpose &&
    other.bytes == bytes &&
    other.mimeType == mimeType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (filename.hashCode) +
    (purpose.hashCode) +
    (bytes.hashCode) +
    (mimeType.hashCode);

  @override
  String toString() => 'CreateUploadRequest[filename=$filename, purpose=$purpose, bytes=$bytes, mimeType=$mimeType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'filename'] = this.filename;
      json[r'purpose'] = this.purpose;
      json[r'bytes'] = this.bytes;
      json[r'mime_type'] = this.mimeType;
    return json;
  }

  /// Returns a new [CreateUploadRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateUploadRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'filename'), 'Required key "CreateUploadRequest[filename]" is missing from JSON.');
        assert(json[r'filename'] != null, 'Required key "CreateUploadRequest[filename]" has a null value in JSON.');
        assert(json.containsKey(r'purpose'), 'Required key "CreateUploadRequest[purpose]" is missing from JSON.');
        assert(json[r'purpose'] != null, 'Required key "CreateUploadRequest[purpose]" has a null value in JSON.');
        assert(json.containsKey(r'bytes'), 'Required key "CreateUploadRequest[bytes]" is missing from JSON.');
        assert(json[r'bytes'] != null, 'Required key "CreateUploadRequest[bytes]" has a null value in JSON.');
        assert(json.containsKey(r'mime_type'), 'Required key "CreateUploadRequest[mime_type]" is missing from JSON.');
        assert(json[r'mime_type'] != null, 'Required key "CreateUploadRequest[mime_type]" has a null value in JSON.');
        return true;
      }());

      return CreateUploadRequest(
        filename: mapValueOfType<String>(json, r'filename')!,
        purpose: CreateUploadRequestPurposeEnum.fromJson(json[r'purpose'])!,
        bytes: mapValueOfType<int>(json, r'bytes')!,
        mimeType: mapValueOfType<String>(json, r'mime_type')!,
      );
    }
    return null;
  }

  static List<CreateUploadRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateUploadRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateUploadRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateUploadRequest> mapFromJson(dynamic json) {
    final map = <String, CreateUploadRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateUploadRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateUploadRequest-objects as value to a dart map
  static Map<String, List<CreateUploadRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateUploadRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateUploadRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'filename',
    'purpose',
    'bytes',
    'mime_type',
  };
}

/// The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
enum CreateUploadRequestPurposeEnum {
  assistants._(r'assistants'),
  batch._(r'batch'),
  fineTune._(r'fine-tune'),
  vision._(r'vision'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreateUploadRequestPurposeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreateUploadRequestPurposeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreateUploadRequestPurposeEnum? fromJson(dynamic value) => CreateUploadRequestPurposeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreateUploadRequestPurposeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreateUploadRequestPurposeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateUploadRequestPurposeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateUploadRequestPurposeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateUploadRequestPurposeEnum] to String,
/// and [decode] dynamic data back to [CreateUploadRequestPurposeEnum].
class CreateUploadRequestPurposeEnumTypeTransformer {
  factory CreateUploadRequestPurposeEnumTypeTransformer() => _instance ??= const CreateUploadRequestPurposeEnumTypeTransformer._();

  const CreateUploadRequestPurposeEnumTypeTransformer._();

  String encode(CreateUploadRequestPurposeEnum data) => data._value;

  /// Returns the instance of [CreateUploadRequestPurposeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateUploadRequestPurposeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreateUploadRequestPurposeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'assistants': return CreateUploadRequestPurposeEnum.assistants;
        case r'batch': return CreateUploadRequestPurposeEnum.batch;
        case r'fine-tune': return CreateUploadRequestPurposeEnum.fineTune;
        case r'vision': return CreateUploadRequestPurposeEnum.vision;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreateUploadRequestPurposeEnumTypeTransformer? _instance;
}


