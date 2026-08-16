//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Embedding {
  /// Returns a new [Embedding] instance.
  Embedding({
    required this.index,
    this.embedding = const [],
    required this.object,
  });

  /// The index of the embedding in the list of embeddings.
  int index;

  /// The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
  List<num> embedding;

  /// The object type, which is always \"embedding\".
  EmbeddingObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Embedding &&
    other.index == index &&
    _deepEquality.equals(other.embedding, embedding) &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (index.hashCode) +
    (embedding.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'Embedding[index=$index, embedding=$embedding, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'index'] = this.index;
      json[r'embedding'] = this.embedding;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [Embedding] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Embedding? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Embedding[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Embedding[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Embedding(
        index: mapValueOfType<int>(json, r'index')!,
        embedding: json[r'embedding'] is Iterable
            ? (json[r'embedding'] as Iterable).cast<num>().toList(growable: false)
            : const [],
        object: EmbeddingObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<Embedding> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Embedding>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Embedding.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Embedding> mapFromJson(dynamic json) {
    final map = <String, Embedding>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Embedding.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Embedding-objects as value to a dart map
  static Map<String, List<Embedding>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Embedding>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Embedding.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'index',
    'embedding',
    'object',
  };
}

/// The object type, which is always \"embedding\".
class EmbeddingObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const EmbeddingObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const embedding = EmbeddingObjectEnum._(r'embedding');

  /// List of all possible values in this [enum][EmbeddingObjectEnum].
  static const values = <EmbeddingObjectEnum>[
    embedding,
  ];

  static EmbeddingObjectEnum? fromJson(dynamic value) => EmbeddingObjectEnumTypeTransformer().decode(value);

  static List<EmbeddingObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EmbeddingObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EmbeddingObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [EmbeddingObjectEnum] to String,
/// and [decode] dynamic data back to [EmbeddingObjectEnum].
class EmbeddingObjectEnumTypeTransformer {
  factory EmbeddingObjectEnumTypeTransformer() => _instance ??= const EmbeddingObjectEnumTypeTransformer._();

  const EmbeddingObjectEnumTypeTransformer._();

  String encode(EmbeddingObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a EmbeddingObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  EmbeddingObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'embedding': return EmbeddingObjectEnum.embedding;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [EmbeddingObjectEnumTypeTransformer] instance.
  static EmbeddingObjectEnumTypeTransformer? _instance;
}


