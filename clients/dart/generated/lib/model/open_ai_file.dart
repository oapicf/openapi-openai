//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OpenAIFile {
  /// Returns a new [OpenAIFile] instance.
  OpenAIFile({
    required this.id,
    required this.bytes,
    required this.createdAt,
    required this.filename,
    required this.object,
    required this.purpose,
    required this.status,
    this.statusDetails,
  });

  /// The file identifier, which can be referenced in the API endpoints.
  String id;

  /// The size of the file, in bytes.
  int bytes;

  /// The Unix timestamp (in seconds) for when the file was created.
  int createdAt;

  /// The name of the file.
  String filename;

  /// The object type, which is always `file`.
  OpenAIFileObjectEnum object;

  /// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  OpenAIFilePurposeEnum purpose;

  /// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  OpenAIFileStatusEnum status;

  /// Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? statusDetails;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OpenAIFile &&
    other.id == id &&
    other.bytes == bytes &&
    other.createdAt == createdAt &&
    other.filename == filename &&
    other.object == object &&
    other.purpose == purpose &&
    other.status == status &&
    other.statusDetails == statusDetails;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (bytes.hashCode) +
    (createdAt.hashCode) +
    (filename.hashCode) +
    (object.hashCode) +
    (purpose.hashCode) +
    (status.hashCode) +
    (statusDetails == null ? 0 : statusDetails!.hashCode);

  @override
  String toString() => 'OpenAIFile[id=$id, bytes=$bytes, createdAt=$createdAt, filename=$filename, object=$object, purpose=$purpose, status=$status, statusDetails=$statusDetails]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'bytes'] = this.bytes;
      json[r'created_at'] = this.createdAt;
      json[r'filename'] = this.filename;
      json[r'object'] = this.object;
      json[r'purpose'] = this.purpose;
      json[r'status'] = this.status;
    if (this.statusDetails != null) {
      json[r'status_details'] = this.statusDetails;
    } else {
      json[r'status_details'] = null;
    }
    return json;
  }

  /// Returns a new [OpenAIFile] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OpenAIFile? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OpenAIFile[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OpenAIFile[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OpenAIFile(
        id: mapValueOfType<String>(json, r'id')!,
        bytes: mapValueOfType<int>(json, r'bytes')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        filename: mapValueOfType<String>(json, r'filename')!,
        object: OpenAIFileObjectEnum.fromJson(json[r'object'])!,
        purpose: OpenAIFilePurposeEnum.fromJson(json[r'purpose'])!,
        status: OpenAIFileStatusEnum.fromJson(json[r'status'])!,
        statusDetails: mapValueOfType<String>(json, r'status_details'),
      );
    }
    return null;
  }

  static List<OpenAIFile> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OpenAIFile>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OpenAIFile.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OpenAIFile> mapFromJson(dynamic json) {
    final map = <String, OpenAIFile>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OpenAIFile.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OpenAIFile-objects as value to a dart map
  static Map<String, List<OpenAIFile>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OpenAIFile>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OpenAIFile.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'bytes',
    'created_at',
    'filename',
    'object',
    'purpose',
    'status',
  };
}

/// The object type, which is always `file`.
class OpenAIFileObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const OpenAIFileObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const file = OpenAIFileObjectEnum._(r'file');

  /// List of all possible values in this [enum][OpenAIFileObjectEnum].
  static const values = <OpenAIFileObjectEnum>[
    file,
  ];

  static OpenAIFileObjectEnum? fromJson(dynamic value) => OpenAIFileObjectEnumTypeTransformer().decode(value);

  static List<OpenAIFileObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OpenAIFileObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OpenAIFileObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OpenAIFileObjectEnum] to String,
/// and [decode] dynamic data back to [OpenAIFileObjectEnum].
class OpenAIFileObjectEnumTypeTransformer {
  factory OpenAIFileObjectEnumTypeTransformer() => _instance ??= const OpenAIFileObjectEnumTypeTransformer._();

  const OpenAIFileObjectEnumTypeTransformer._();

  String encode(OpenAIFileObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OpenAIFileObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OpenAIFileObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'file': return OpenAIFileObjectEnum.file;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OpenAIFileObjectEnumTypeTransformer] instance.
  static OpenAIFileObjectEnumTypeTransformer? _instance;
}


/// The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
class OpenAIFilePurposeEnum {
  /// Instantiate a new enum with the provided [value].
  const OpenAIFilePurposeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const assistants = OpenAIFilePurposeEnum._(r'assistants');
  static const assistantsOutput = OpenAIFilePurposeEnum._(r'assistants_output');
  static const batch = OpenAIFilePurposeEnum._(r'batch');
  static const batchOutput = OpenAIFilePurposeEnum._(r'batch_output');
  static const fineTune = OpenAIFilePurposeEnum._(r'fine-tune');
  static const fineTuneResults = OpenAIFilePurposeEnum._(r'fine-tune-results');
  static const vision = OpenAIFilePurposeEnum._(r'vision');

  /// List of all possible values in this [enum][OpenAIFilePurposeEnum].
  static const values = <OpenAIFilePurposeEnum>[
    assistants,
    assistantsOutput,
    batch,
    batchOutput,
    fineTune,
    fineTuneResults,
    vision,
  ];

  static OpenAIFilePurposeEnum? fromJson(dynamic value) => OpenAIFilePurposeEnumTypeTransformer().decode(value);

  static List<OpenAIFilePurposeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OpenAIFilePurposeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OpenAIFilePurposeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OpenAIFilePurposeEnum] to String,
/// and [decode] dynamic data back to [OpenAIFilePurposeEnum].
class OpenAIFilePurposeEnumTypeTransformer {
  factory OpenAIFilePurposeEnumTypeTransformer() => _instance ??= const OpenAIFilePurposeEnumTypeTransformer._();

  const OpenAIFilePurposeEnumTypeTransformer._();

  String encode(OpenAIFilePurposeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OpenAIFilePurposeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OpenAIFilePurposeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'assistants': return OpenAIFilePurposeEnum.assistants;
        case r'assistants_output': return OpenAIFilePurposeEnum.assistantsOutput;
        case r'batch': return OpenAIFilePurposeEnum.batch;
        case r'batch_output': return OpenAIFilePurposeEnum.batchOutput;
        case r'fine-tune': return OpenAIFilePurposeEnum.fineTune;
        case r'fine-tune-results': return OpenAIFilePurposeEnum.fineTuneResults;
        case r'vision': return OpenAIFilePurposeEnum.vision;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OpenAIFilePurposeEnumTypeTransformer] instance.
  static OpenAIFilePurposeEnumTypeTransformer? _instance;
}


/// Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
class OpenAIFileStatusEnum {
  /// Instantiate a new enum with the provided [value].
  const OpenAIFileStatusEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const uploaded = OpenAIFileStatusEnum._(r'uploaded');
  static const processed = OpenAIFileStatusEnum._(r'processed');
  static const error = OpenAIFileStatusEnum._(r'error');

  /// List of all possible values in this [enum][OpenAIFileStatusEnum].
  static const values = <OpenAIFileStatusEnum>[
    uploaded,
    processed,
    error,
  ];

  static OpenAIFileStatusEnum? fromJson(dynamic value) => OpenAIFileStatusEnumTypeTransformer().decode(value);

  static List<OpenAIFileStatusEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OpenAIFileStatusEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OpenAIFileStatusEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OpenAIFileStatusEnum] to String,
/// and [decode] dynamic data back to [OpenAIFileStatusEnum].
class OpenAIFileStatusEnumTypeTransformer {
  factory OpenAIFileStatusEnumTypeTransformer() => _instance ??= const OpenAIFileStatusEnumTypeTransformer._();

  const OpenAIFileStatusEnumTypeTransformer._();

  String encode(OpenAIFileStatusEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OpenAIFileStatusEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OpenAIFileStatusEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'uploaded': return OpenAIFileStatusEnum.uploaded;
        case r'processed': return OpenAIFileStatusEnum.processed;
        case r'error': return OpenAIFileStatusEnum.error;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OpenAIFileStatusEnumTypeTransformer] instance.
  static OpenAIFileStatusEnumTypeTransformer? _instance;
}


