//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageImagesResult {
  /// Returns a new [UsageImagesResult] instance.
  UsageImagesResult({
    required this.object,
    required this.images,
    required this.numModelRequests,
    this.source_,
    this.size,
    this.projectId,
    this.userId,
    this.apiKeyId,
    this.model,
  });

  UsageImagesResultObjectEnum object;

  /// The number of images processed.
  int images;

  /// The count of requests made to the model.
  int numModelRequests;

  /// When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  String? source_;

  /// When `group_by=size`, this field provides the image size of the grouped usage result.
  String? size;

  /// When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  String? projectId;

  /// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  String? userId;

  /// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  String? apiKeyId;

  /// When `group_by=model`, this field provides the model name of the grouped usage result.
  String? model;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageImagesResult &&
    other.object == object &&
    other.images == images &&
    other.numModelRequests == numModelRequests &&
    other.source_ == source_ &&
    other.size == size &&
    other.projectId == projectId &&
    other.userId == userId &&
    other.apiKeyId == apiKeyId &&
    other.model == model;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (images.hashCode) +
    (numModelRequests.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (apiKeyId == null ? 0 : apiKeyId!.hashCode) +
    (model == null ? 0 : model!.hashCode);

  @override
  String toString() => 'UsageImagesResult[object=$object, images=$images, numModelRequests=$numModelRequests, source_=$source_, size=$size, projectId=$projectId, userId=$userId, apiKeyId=$apiKeyId, model=$model]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'images'] = this.images;
      json[r'num_model_requests'] = this.numModelRequests;
    if (this.source_ != null) {
      json[r'source'] = this.source_;
    } else {
      json[r'source'] = null;
    }
    if (this.size != null) {
      json[r'size'] = this.size;
    } else {
      json[r'size'] = null;
    }
    if (this.projectId != null) {
      json[r'project_id'] = this.projectId;
    } else {
      json[r'project_id'] = null;
    }
    if (this.userId != null) {
      json[r'user_id'] = this.userId;
    } else {
      json[r'user_id'] = null;
    }
    if (this.apiKeyId != null) {
      json[r'api_key_id'] = this.apiKeyId;
    } else {
      json[r'api_key_id'] = null;
    }
    if (this.model != null) {
      json[r'model'] = this.model;
    } else {
      json[r'model'] = null;
    }
    return json;
  }

  /// Returns a new [UsageImagesResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageImagesResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageImagesResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageImagesResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageImagesResult(
        object: UsageImagesResultObjectEnum.fromJson(json[r'object'])!,
        images: mapValueOfType<int>(json, r'images')!,
        numModelRequests: mapValueOfType<int>(json, r'num_model_requests')!,
        source_: mapValueOfType<String>(json, r'source'),
        size: mapValueOfType<String>(json, r'size'),
        projectId: mapValueOfType<String>(json, r'project_id'),
        userId: mapValueOfType<String>(json, r'user_id'),
        apiKeyId: mapValueOfType<String>(json, r'api_key_id'),
        model: mapValueOfType<String>(json, r'model'),
      );
    }
    return null;
  }

  static List<UsageImagesResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageImagesResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageImagesResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageImagesResult> mapFromJson(dynamic json) {
    final map = <String, UsageImagesResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageImagesResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageImagesResult-objects as value to a dart map
  static Map<String, List<UsageImagesResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageImagesResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageImagesResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'images',
    'num_model_requests',
  };
}


class UsageImagesResultObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageImagesResultObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodUsagePeriodImagesPeriodResult = UsageImagesResultObjectEnum._(r'organization.usage.images.result');

  /// List of all possible values in this [enum][UsageImagesResultObjectEnum].
  static const values = <UsageImagesResultObjectEnum>[
    organizationPeriodUsagePeriodImagesPeriodResult,
  ];

  static UsageImagesResultObjectEnum? fromJson(dynamic value) => UsageImagesResultObjectEnumTypeTransformer().decode(value);

  static List<UsageImagesResultObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageImagesResultObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageImagesResultObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageImagesResultObjectEnum] to String,
/// and [decode] dynamic data back to [UsageImagesResultObjectEnum].
class UsageImagesResultObjectEnumTypeTransformer {
  factory UsageImagesResultObjectEnumTypeTransformer() => _instance ??= const UsageImagesResultObjectEnumTypeTransformer._();

  const UsageImagesResultObjectEnumTypeTransformer._();

  String encode(UsageImagesResultObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageImagesResultObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageImagesResultObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.usage.images.result': return UsageImagesResultObjectEnum.organizationPeriodUsagePeriodImagesPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageImagesResultObjectEnumTypeTransformer] instance.
  static UsageImagesResultObjectEnumTypeTransformer? _instance;
}


