//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UsageTimeBucketResultInner {
  /// Returns a new [UsageTimeBucketResultInner] instance.
  UsageTimeBucketResultInner({
    required this.object,
    required this.inputTokens,
    this.inputCachedTokens,
    required this.outputTokens,
    this.inputAudioTokens,
    this.outputAudioTokens,
    required this.numModelRequests,
    this.projectId,
    this.userId,
    this.apiKeyId,
    this.model,
    this.batch,
    required this.images,
    this.source_,
    this.size,
    required this.characters,
    required this.seconds,
    required this.usageBytes,
    required this.sessions,
    this.amount,
    this.lineItem,
  });

  UsageTimeBucketResultInnerObjectEnum object;

  /// The aggregated number of input tokens used.
  int inputTokens;

  /// The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inputCachedTokens;

  /// The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  int outputTokens;

  /// The aggregated number of audio input tokens used, including cached tokens.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inputAudioTokens;

  /// The aggregated number of audio output tokens used.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? outputAudioTokens;

  /// The count of requests made to the model.
  int numModelRequests;

  /// When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  String? projectId;

  /// When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  String? userId;

  /// When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  String? apiKeyId;

  /// When `group_by=model`, this field provides the model name of the grouped usage result.
  String? model;

  /// When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  bool? batch;

  /// The number of images processed.
  int images;

  /// When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  String? source_;

  /// When `group_by=size`, this field provides the image size of the grouped usage result.
  String? size;

  /// The number of characters processed.
  int characters;

  /// The number of seconds processed.
  int seconds;

  /// The vector stores usage in bytes.
  int usageBytes;

  /// The number of code interpreter sessions.
  int sessions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CostsResultAmount? amount;

  /// When `group_by=line_item`, this field provides the line item of the grouped costs result.
  String? lineItem;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UsageTimeBucketResultInner &&
    other.object == object &&
    other.inputTokens == inputTokens &&
    other.inputCachedTokens == inputCachedTokens &&
    other.outputTokens == outputTokens &&
    other.inputAudioTokens == inputAudioTokens &&
    other.outputAudioTokens == outputAudioTokens &&
    other.numModelRequests == numModelRequests &&
    other.projectId == projectId &&
    other.userId == userId &&
    other.apiKeyId == apiKeyId &&
    other.model == model &&
    other.batch == batch &&
    other.images == images &&
    other.source_ == source_ &&
    other.size == size &&
    other.characters == characters &&
    other.seconds == seconds &&
    other.usageBytes == usageBytes &&
    other.sessions == sessions &&
    other.amount == amount &&
    other.lineItem == lineItem;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (inputTokens.hashCode) +
    (inputCachedTokens == null ? 0 : inputCachedTokens!.hashCode) +
    (outputTokens.hashCode) +
    (inputAudioTokens == null ? 0 : inputAudioTokens!.hashCode) +
    (outputAudioTokens == null ? 0 : outputAudioTokens!.hashCode) +
    (numModelRequests.hashCode) +
    (projectId == null ? 0 : projectId!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (apiKeyId == null ? 0 : apiKeyId!.hashCode) +
    (model == null ? 0 : model!.hashCode) +
    (batch == null ? 0 : batch!.hashCode) +
    (images.hashCode) +
    (source_ == null ? 0 : source_!.hashCode) +
    (size == null ? 0 : size!.hashCode) +
    (characters.hashCode) +
    (seconds.hashCode) +
    (usageBytes.hashCode) +
    (sessions.hashCode) +
    (amount == null ? 0 : amount!.hashCode) +
    (lineItem == null ? 0 : lineItem!.hashCode);

  @override
  String toString() => 'UsageTimeBucketResultInner[object=$object, inputTokens=$inputTokens, inputCachedTokens=$inputCachedTokens, outputTokens=$outputTokens, inputAudioTokens=$inputAudioTokens, outputAudioTokens=$outputAudioTokens, numModelRequests=$numModelRequests, projectId=$projectId, userId=$userId, apiKeyId=$apiKeyId, model=$model, batch=$batch, images=$images, source_=$source_, size=$size, characters=$characters, seconds=$seconds, usageBytes=$usageBytes, sessions=$sessions, amount=$amount, lineItem=$lineItem]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'input_tokens'] = this.inputTokens;
    if (this.inputCachedTokens != null) {
      json[r'input_cached_tokens'] = this.inputCachedTokens;
    } else {
      json[r'input_cached_tokens'] = null;
    }
      json[r'output_tokens'] = this.outputTokens;
    if (this.inputAudioTokens != null) {
      json[r'input_audio_tokens'] = this.inputAudioTokens;
    } else {
      json[r'input_audio_tokens'] = null;
    }
    if (this.outputAudioTokens != null) {
      json[r'output_audio_tokens'] = this.outputAudioTokens;
    } else {
      json[r'output_audio_tokens'] = null;
    }
      json[r'num_model_requests'] = this.numModelRequests;
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
    if (this.batch != null) {
      json[r'batch'] = this.batch;
    } else {
      json[r'batch'] = null;
    }
      json[r'images'] = this.images;
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
      json[r'characters'] = this.characters;
      json[r'seconds'] = this.seconds;
      json[r'usage_bytes'] = this.usageBytes;
      json[r'sessions'] = this.sessions;
    if (this.amount != null) {
      json[r'amount'] = this.amount;
    } else {
      json[r'amount'] = null;
    }
    if (this.lineItem != null) {
      json[r'line_item'] = this.lineItem;
    } else {
      json[r'line_item'] = null;
    }
    return json;
  }

  /// Returns a new [UsageTimeBucketResultInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UsageTimeBucketResultInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UsageTimeBucketResultInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UsageTimeBucketResultInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UsageTimeBucketResultInner(
        object: UsageTimeBucketResultInnerObjectEnum.fromJson(json[r'object'])!,
        inputTokens: mapValueOfType<int>(json, r'input_tokens')!,
        inputCachedTokens: mapValueOfType<int>(json, r'input_cached_tokens'),
        outputTokens: mapValueOfType<int>(json, r'output_tokens')!,
        inputAudioTokens: mapValueOfType<int>(json, r'input_audio_tokens'),
        outputAudioTokens: mapValueOfType<int>(json, r'output_audio_tokens'),
        numModelRequests: mapValueOfType<int>(json, r'num_model_requests')!,
        projectId: mapValueOfType<String>(json, r'project_id'),
        userId: mapValueOfType<String>(json, r'user_id'),
        apiKeyId: mapValueOfType<String>(json, r'api_key_id'),
        model: mapValueOfType<String>(json, r'model'),
        batch: mapValueOfType<bool>(json, r'batch'),
        images: mapValueOfType<int>(json, r'images')!,
        source_: mapValueOfType<String>(json, r'source'),
        size: mapValueOfType<String>(json, r'size'),
        characters: mapValueOfType<int>(json, r'characters')!,
        seconds: mapValueOfType<int>(json, r'seconds')!,
        usageBytes: mapValueOfType<int>(json, r'usage_bytes')!,
        sessions: mapValueOfType<int>(json, r'sessions')!,
        amount: CostsResultAmount.fromJson(json[r'amount']),
        lineItem: mapValueOfType<String>(json, r'line_item'),
      );
    }
    return null;
  }

  static List<UsageTimeBucketResultInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageTimeBucketResultInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageTimeBucketResultInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UsageTimeBucketResultInner> mapFromJson(dynamic json) {
    final map = <String, UsageTimeBucketResultInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UsageTimeBucketResultInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UsageTimeBucketResultInner-objects as value to a dart map
  static Map<String, List<UsageTimeBucketResultInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UsageTimeBucketResultInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UsageTimeBucketResultInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'input_tokens',
    'output_tokens',
    'num_model_requests',
    'images',
    'characters',
    'seconds',
    'usage_bytes',
    'sessions',
  };
}


class UsageTimeBucketResultInnerObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const UsageTimeBucketResultInnerObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const organizationPeriodCostsPeriodResult = UsageTimeBucketResultInnerObjectEnum._(r'organization.costs.result');

  /// List of all possible values in this [enum][UsageTimeBucketResultInnerObjectEnum].
  static const values = <UsageTimeBucketResultInnerObjectEnum>[
    organizationPeriodCostsPeriodResult,
  ];

  static UsageTimeBucketResultInnerObjectEnum? fromJson(dynamic value) => UsageTimeBucketResultInnerObjectEnumTypeTransformer().decode(value);

  static List<UsageTimeBucketResultInnerObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UsageTimeBucketResultInnerObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UsageTimeBucketResultInnerObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UsageTimeBucketResultInnerObjectEnum] to String,
/// and [decode] dynamic data back to [UsageTimeBucketResultInnerObjectEnum].
class UsageTimeBucketResultInnerObjectEnumTypeTransformer {
  factory UsageTimeBucketResultInnerObjectEnumTypeTransformer() => _instance ??= const UsageTimeBucketResultInnerObjectEnumTypeTransformer._();

  const UsageTimeBucketResultInnerObjectEnumTypeTransformer._();

  String encode(UsageTimeBucketResultInnerObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a UsageTimeBucketResultInnerObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UsageTimeBucketResultInnerObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'organization.costs.result': return UsageTimeBucketResultInnerObjectEnum.organizationPeriodCostsPeriodResult;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UsageTimeBucketResultInnerObjectEnumTypeTransformer] instance.
  static UsageTimeBucketResultInnerObjectEnumTypeTransformer? _instance;
}


