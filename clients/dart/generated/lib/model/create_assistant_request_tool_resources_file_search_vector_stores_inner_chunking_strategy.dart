//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy {
  /// Returns a new [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] instance.
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy({
    required this.type,
    required this.static_,
  });

  /// Always `auto`.
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum type;

  StaticChunkingStrategyStatic static_;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy &&
    other.type == type &&
    other.static_ == static_;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (type.hashCode) +
    (static_.hashCode);

  @override
  String toString() => 'CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy[type=$type, static_=$static_]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'type'] = this.type;
      json[r'static'] = this.static_;
    return json;
  }

  /// Returns a new [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy(
        type: CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum.fromJson(json[r'type'])!,
        static_: StaticChunkingStrategyStatic.fromJson(json[r'static'])!,
      );
    }
    return null;
  }

  static List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy> mapFromJson(dynamic json) {
    final map = <String, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy-objects as value to a dart map
  static Map<String, List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
    'static',
  };
}

/// Always `auto`.
class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const auto = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum._(r'auto');
  static const static_ = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum._(r'static');

  /// List of all possible values in this [enum][CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum].
  static const values = <CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum>[
    auto,
    static_,
  ];

  static CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum? fromJson(dynamic value) => CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer().decode(value);

  static List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum] to String,
/// and [decode] dynamic data back to [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum].
class CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer {
  factory CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer() => _instance ??= const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer._();

  const CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer._();

  String encode(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'auto': return CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum.auto;
        case r'static': return CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnum.static_;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer] instance.
  static CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyTypeEnumTypeTransformer? _instance;
}


