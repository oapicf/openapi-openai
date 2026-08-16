//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationResponseResultsInnerCategoryAppliedInputTypes {
  /// Returns a new [CreateModerationResponseResultsInnerCategoryAppliedInputTypes] instance.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes({
    this.hate = const [],
    this.hateSlashThreatening = const [],
    this.harassment = const [],
    this.harassmentSlashThreatening = const [],
    this.illicit = const [],
    this.illicitSlashViolent = const [],
    this.selfHarm = const [],
    this.selfHarmSlashIntent = const [],
    this.selfHarmSlashInstructions = const [],
    this.sexual = const [],
    this.sexualSlashMinors = const [],
    this.violence = const [],
    this.violenceSlashGraphic = const [],
  });

  /// The applied input type(s) for the category 'hate'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum> hate;

  /// The applied input type(s) for the category 'hate/threatening'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum> hateSlashThreatening;

  /// The applied input type(s) for the category 'harassment'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum> harassment;

  /// The applied input type(s) for the category 'harassment/threatening'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum> harassmentSlashThreatening;

  /// The applied input type(s) for the category 'illicit'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum> illicit;

  /// The applied input type(s) for the category 'illicit/violent'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum> illicitSlashViolent;

  /// The applied input type(s) for the category 'self-harm'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum> selfHarm;

  /// The applied input type(s) for the category 'self-harm/intent'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum> selfHarmSlashIntent;

  /// The applied input type(s) for the category 'self-harm/instructions'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum> selfHarmSlashInstructions;

  /// The applied input type(s) for the category 'sexual'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum> sexual;

  /// The applied input type(s) for the category 'sexual/minors'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum> sexualSlashMinors;

  /// The applied input type(s) for the category 'violence'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum> violence;

  /// The applied input type(s) for the category 'violence/graphic'.
  List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum> violenceSlashGraphic;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationResponseResultsInnerCategoryAppliedInputTypes &&
    _deepEquality.equals(other.hate, hate) &&
    _deepEquality.equals(other.hateSlashThreatening, hateSlashThreatening) &&
    _deepEquality.equals(other.harassment, harassment) &&
    _deepEquality.equals(other.harassmentSlashThreatening, harassmentSlashThreatening) &&
    _deepEquality.equals(other.illicit, illicit) &&
    _deepEquality.equals(other.illicitSlashViolent, illicitSlashViolent) &&
    _deepEquality.equals(other.selfHarm, selfHarm) &&
    _deepEquality.equals(other.selfHarmSlashIntent, selfHarmSlashIntent) &&
    _deepEquality.equals(other.selfHarmSlashInstructions, selfHarmSlashInstructions) &&
    _deepEquality.equals(other.sexual, sexual) &&
    _deepEquality.equals(other.sexualSlashMinors, sexualSlashMinors) &&
    _deepEquality.equals(other.violence, violence) &&
    _deepEquality.equals(other.violenceSlashGraphic, violenceSlashGraphic);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hate.hashCode) +
    (hateSlashThreatening.hashCode) +
    (harassment.hashCode) +
    (harassmentSlashThreatening.hashCode) +
    (illicit.hashCode) +
    (illicitSlashViolent.hashCode) +
    (selfHarm.hashCode) +
    (selfHarmSlashIntent.hashCode) +
    (selfHarmSlashInstructions.hashCode) +
    (sexual.hashCode) +
    (sexualSlashMinors.hashCode) +
    (violence.hashCode) +
    (violenceSlashGraphic.hashCode);

  @override
  String toString() => 'CreateModerationResponseResultsInnerCategoryAppliedInputTypes[hate=$hate, hateSlashThreatening=$hateSlashThreatening, harassment=$harassment, harassmentSlashThreatening=$harassmentSlashThreatening, illicit=$illicit, illicitSlashViolent=$illicitSlashViolent, selfHarm=$selfHarm, selfHarmSlashIntent=$selfHarmSlashIntent, selfHarmSlashInstructions=$selfHarmSlashInstructions, sexual=$sexual, sexualSlashMinors=$sexualSlashMinors, violence=$violence, violenceSlashGraphic=$violenceSlashGraphic]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'hate'] = this.hate;
      json[r'hate/threatening'] = this.hateSlashThreatening;
      json[r'harassment'] = this.harassment;
      json[r'harassment/threatening'] = this.harassmentSlashThreatening;
      json[r'illicit'] = this.illicit;
      json[r'illicit/violent'] = this.illicitSlashViolent;
      json[r'self-harm'] = this.selfHarm;
      json[r'self-harm/intent'] = this.selfHarmSlashIntent;
      json[r'self-harm/instructions'] = this.selfHarmSlashInstructions;
      json[r'sexual'] = this.sexual;
      json[r'sexual/minors'] = this.sexualSlashMinors;
      json[r'violence'] = this.violence;
      json[r'violence/graphic'] = this.violenceSlashGraphic;
    return json;
  }

  /// Returns a new [CreateModerationResponseResultsInnerCategoryAppliedInputTypes] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypes? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateModerationResponseResultsInnerCategoryAppliedInputTypes[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateModerationResponseResultsInnerCategoryAppliedInputTypes[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateModerationResponseResultsInnerCategoryAppliedInputTypes(
        hate: CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum.listFromJson(json[r'hate']),
        hateSlashThreatening: CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum.listFromJson(json[r'hate/threatening']),
        harassment: CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum.listFromJson(json[r'harassment']),
        harassmentSlashThreatening: CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum.listFromJson(json[r'harassment/threatening']),
        illicit: CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum.listFromJson(json[r'illicit']),
        illicitSlashViolent: CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum.listFromJson(json[r'illicit/violent']),
        selfHarm: CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum.listFromJson(json[r'self-harm']),
        selfHarmSlashIntent: CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum.listFromJson(json[r'self-harm/intent']),
        selfHarmSlashInstructions: CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum.listFromJson(json[r'self-harm/instructions']),
        sexual: CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum.listFromJson(json[r'sexual']),
        sexualSlashMinors: CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum.listFromJson(json[r'sexual/minors']),
        violence: CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum.listFromJson(json[r'violence']),
        violenceSlashGraphic: CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum.listFromJson(json[r'violence/graphic']),
      );
    }
    return null;
  }

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationResponseResultsInnerCategoryAppliedInputTypes> mapFromJson(dynamic json) {
    final map = <String, CreateModerationResponseResultsInnerCategoryAppliedInputTypes>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypes.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationResponseResultsInnerCategoryAppliedInputTypes-objects as value to a dart map
  static Map<String, List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationResponseResultsInnerCategoryAppliedInputTypes>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationResponseResultsInnerCategoryAppliedInputTypes.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'hate',
    'hate/threatening',
    'harassment',
    'harassment/threatening',
    'illicit',
    'illicit/violent',
    'self-harm',
    'self-harm/intent',
    'self-harm/instructions',
    'sexual',
    'sexual/minors',
    'violence',
    'violence/graphic',
  };
}


class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashThreateningEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashThreateningEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashViolentEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashIntentEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSelfHarmSlashInstructionsEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum._(r'text');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum>[
    text,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnum.text;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashMinorsEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceEnumTypeTransformer? _instance;
}



class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const text = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum._(r'text');
  static const image = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum._(r'image');

  /// List of all possible values in this [enum][CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum].
  static const values = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum>[
    text,
    image,
  ];

  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum? fromJson(dynamic value) => CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer().decode(value);

  static List<CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum] to String,
/// and [decode] dynamic data back to [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum].
class CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer {
  factory CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer() => _instance ??= const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer._();

  const CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer._();

  String encode(CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'text': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum.text;
        case r'image': return CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer] instance.
  static CreateModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashGraphicEnumTypeTransformer? _instance;
}


