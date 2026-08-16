//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BatchRequestInput {
  /// Returns a new [BatchRequestInput] instance.
  BatchRequestInput({
    this.customId,
    this.method,
    this.url,
  });

  /// A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customId;

  /// The HTTP method to be used for the request. Currently only `POST` is supported.
  BatchRequestInputMethodEnum? method;

  /// The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? url;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BatchRequestInput &&
    other.customId == customId &&
    other.method == method &&
    other.url == url;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customId == null ? 0 : customId!.hashCode) +
    (method == null ? 0 : method!.hashCode) +
    (url == null ? 0 : url!.hashCode);

  @override
  String toString() => 'BatchRequestInput[customId=$customId, method=$method, url=$url]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.customId != null) {
      json[r'custom_id'] = this.customId;
    } else {
      json[r'custom_id'] = null;
    }
    if (this.method != null) {
      json[r'method'] = this.method;
    } else {
      json[r'method'] = null;
    }
    if (this.url != null) {
      json[r'url'] = this.url;
    } else {
      json[r'url'] = null;
    }
    return json;
  }

  /// Returns a new [BatchRequestInput] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BatchRequestInput? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BatchRequestInput[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BatchRequestInput[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BatchRequestInput(
        customId: mapValueOfType<String>(json, r'custom_id'),
        method: BatchRequestInputMethodEnum.fromJson(json[r'method']),
        url: mapValueOfType<String>(json, r'url'),
      );
    }
    return null;
  }

  static List<BatchRequestInput> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchRequestInput>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchRequestInput.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BatchRequestInput> mapFromJson(dynamic json) {
    final map = <String, BatchRequestInput>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BatchRequestInput.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BatchRequestInput-objects as value to a dart map
  static Map<String, List<BatchRequestInput>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BatchRequestInput>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BatchRequestInput.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The HTTP method to be used for the request. Currently only `POST` is supported.
class BatchRequestInputMethodEnum {
  /// Instantiate a new enum with the provided [value].
  const BatchRequestInputMethodEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const POST = BatchRequestInputMethodEnum._(r'POST');

  /// List of all possible values in this [enum][BatchRequestInputMethodEnum].
  static const values = <BatchRequestInputMethodEnum>[
    POST,
  ];

  static BatchRequestInputMethodEnum? fromJson(dynamic value) => BatchRequestInputMethodEnumTypeTransformer().decode(value);

  static List<BatchRequestInputMethodEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchRequestInputMethodEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchRequestInputMethodEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BatchRequestInputMethodEnum] to String,
/// and [decode] dynamic data back to [BatchRequestInputMethodEnum].
class BatchRequestInputMethodEnumTypeTransformer {
  factory BatchRequestInputMethodEnumTypeTransformer() => _instance ??= const BatchRequestInputMethodEnumTypeTransformer._();

  const BatchRequestInputMethodEnumTypeTransformer._();

  String encode(BatchRequestInputMethodEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a BatchRequestInputMethodEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BatchRequestInputMethodEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'POST': return BatchRequestInputMethodEnum.POST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BatchRequestInputMethodEnumTypeTransformer] instance.
  static BatchRequestInputMethodEnumTypeTransformer? _instance;
}


