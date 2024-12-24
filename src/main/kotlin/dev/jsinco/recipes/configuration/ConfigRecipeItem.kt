package dev.jsinco.recipes.configuration

import org.bukkit.Material

interface ConfigRecipeItem {
    var ingredientFormat: String
    var material: Material
    var name: String
    var lore: List<String>
    var glint: Boolean
    var useRecipeCustomModelData: Boolean
}